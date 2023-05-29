package pojo;

import java.util.Date;

/**
 * 功能
 *
 * @author caojianbang
 * @date 25.7.22 6:45 PM
 */
public class Users {
    private Integer id;
    private String userName;//表中列名大小写无所谓，类中必须驼峰
    private Date birthday;
    private String sex;
    private String address;

    public Users() {
    }

    public Users(String userName, Date birthday, String sex, String address) {
        this.userName = userName;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    public Users(Integer id, String userName, Date birthday, String sex, String address) {
        this.id = id;
        this.userName = userName;
        this.birthday = birthday;
        this.sex = sex;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
