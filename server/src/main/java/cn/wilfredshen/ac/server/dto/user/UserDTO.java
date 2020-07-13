package cn.wilfredshen.ac.server.dto.user;

import cn.wilfredshen.ac.server.dto.base.UserBaseDTO;

/**
 * @author WilfredShen
 */
public class UserDTO extends UserBaseDTO {

    private String password;
    private String salt;
    private String realname;
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", realname='" + realname + '\'' +
                ", email='" + email + '\'' +
                "} " + super.toString();
    }
}
