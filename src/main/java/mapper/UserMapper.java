package mapper;


import org.apache.ibatis.annotations.Param;
import pojo.Users;

import java.util.ArrayList;

/**
 * 功能
 *
 * @author caojianbang
 * @date 25.7.22 6:53 PM
 */
public interface UserMapper {
//查询全部用户信息
    ArrayList<Users> getAll();
}
