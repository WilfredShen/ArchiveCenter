package cn.wilfredshen.ac.server.dto.user;

import cn.wilfredshen.ac.server.dto.base.UserBaseDTO;

import java.util.Objects;

/**
 * @author WilfredShen
 */
public class UserLoginDTO extends UserBaseDTO {

    private String password;
    private String salt;

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

    @Override
    public String toString() {
        return "UserLoginDTO{" +
                "password='" + password + '\'' +
                "} " + super.toString();
    }
}
