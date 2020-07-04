package cn.wilfredshen.ac.server.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Objects;

public class User extends AbstractUser {

    /**
     * real name (也许吧...)
     */
    @Nullable
    @NotBlank(message = "姓名不能为空白")
    private String name;

    /**
     * email address (可以为空，但是不为空时格式应当正确)
     */
    @Nullable
    @Email(message = "请输入正确的邮箱")
    private String email;

    public User() {
    }

    public User(
            int id,
            @NotNull @NotBlank(message = "用户名不能为空") @Pattern(regexp = "^[A-Za-z_]\\w{3,15}$") String username,
            @NotNull @NotBlank(message = "密码不能为空") String password
    ) {
        super(id, username, password);
    }

    public User(
            int id,
            @NotNull @NotBlank(message = "用户名不能为空") @Pattern(regexp = "^[A-Za-z_]\\w{3,15}$") String username,
            @NotNull @NotBlank(message = "密码不能为空") String password,
            @Nullable @NotBlank(message = "姓名不能为空白") String name,
            @Nullable @Email(message = "请输入正确的邮箱") String email
    ) {
        super(id, username, password);
        this.name = name;
        this.email = email;
    }

    @Nullable
    @javax.validation.constraints.NotNull
    public String getName() {
        return name;
    }

    public void setName(@Nullable String name) {
        this.name = name;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + this.getId() +
                ", username='" + this.getUsername() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                "} ";
    }
}
