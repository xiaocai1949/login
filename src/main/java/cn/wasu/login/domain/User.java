package cn.wasu.login.domain;

/**
 * @ClassName User
 * @Description 用户类
 * @Author Administrator
 * @Date 2019/8/9 17:23
 * @Version 1.0
 **/


public class User {
    /*主键id*/
    private int id;
    /*用户名*/
    private String userName;
    /*密码*/
    private String passWord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
