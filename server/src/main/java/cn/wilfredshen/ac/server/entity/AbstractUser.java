package cn.wilfredshen.ac.server.entity;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public abstract class AbstractUser {

    /**
     * user id (auto generated)
     */
    private int id;

    /**
     * user name (4~16个字符)
     */
    @NotNull
    @NotBlank(message = "用户名不能为空")
    @Pattern(regexp = "^[A-Za-z_]\\w{3,15}$")
    private String username;

    /**
     * user password (salted)
     */
    @NotNull
    @NotBlank(message = "密码不能为空")
    private String password;

    @Contract(pure = true)
    public AbstractUser() {
        this.id = 0;
        this.username = "";
        this.password = "";
    }

    @Contract(pure = true)
    public AbstractUser(
            int id,
            @NotNull @NotBlank(message = "用户名不能为空") @Pattern(regexp = "^[A-Za-z_]\\w{3,15}$") String username,
            @NotNull @NotBlank(message = "密码不能为空") String password
    ) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NotNull String username) {
        this.username = username;
    }

    @NotNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NotNull String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractUser)) return false;
        AbstractUser that = (AbstractUser) o;
        return id == that.id &&
                username.equals(that.username) &&
                password.equals(that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }

    @Override
    public String toString() {
        return "AbstractUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
