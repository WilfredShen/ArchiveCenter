package cn.wilfredshen.ac.server.dto.base;

/**
 * @author WilfredShen
 */
public class UserBaseDTO {

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserBaseDTO{" +
                "username='" + username + '\'' +
                '}';
    }
}
