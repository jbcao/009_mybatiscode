import mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pojo.Users;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * 功能
 *
 * @author caojianbang
 * @date 8.8.22 12:48 PM
 */
public class Code {
    SqlSession ss;
    UserMapper um;
    @Before
    public void before() {
        try {
            //        读取核心配置文件,注意这里读取的是核心配置文件，之前写错，调试1个小时
            InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
            //        创建工厂对象
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            //        取出selsession
            ss = factory.openSession();
            //        取出动态代理的对象，完成接口方法的调用，实则调用xml文件中相应的标签的功能
            um = ss.getMapper(UserMapper.class);
            System.out.println(um.getClass());//class com.sun.proxy.$Proxy4 是代理对象
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        ss.close();
    }

    @Test
    public void getAll() {
        ArrayList<Users> list = um.getAll();
        list.forEach(users -> System.out.println(users));
    }
}
