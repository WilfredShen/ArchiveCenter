package cn.wilfredshen.ac.server.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.sql.Timestamp;

/**
 * @author WilfredShen
 */
public class User {

    /**
     * entity id (auto generated)
     */
    @NotNull
    private Integer uid = 0;

    /**
     * user name (4~16个字符)
     */
    @NotNull
    private String username = "";

    /**
     * user password (md5)
     */
    @NotNull
    private String password = "";

    /**
     * salt
     */
    @NotNull
    private String salt = "";

    /**
     * real name (也许吧...)
     */
    @Nullable
    private String realname;

    /**
     * email address (可以为空，但是不为空时格式应当正确)
     */
    @Nullable
    private String email;

    @NotNull
    private Timestamp registerDatetime = new Timestamp(0);

    @Nullable
    private Timestamp latestLoginDatetime;

    @NotNull
    public Integer getUid() {
        return uid;
    }

    public void setUid(@NotNull Integer uid) {
        this.uid = uid;
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

    @NotNull
    public String getSalt() {
        return salt;
    }

    public void setSalt(@NotNull String salt) {
        this.salt = salt;
    }

    @Nullable
    public String getRealname() {
        return realname;
    }

    public void setRealname(@Nullable String realname) {
        this.realname = realname;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @NotNull
    public Timestamp getRegisterDatetime() {
        return registerDatetime;
    }

    public void setRegisterDatetime(@NotNull Timestamp registerDatetime) {
        this.registerDatetime = registerDatetime;
    }

    @Nullable
    public Timestamp getLatestLoginDatetime() {
        return latestLoginDatetime;
    }

    public void setLatestLoginDatetime(@Nullable Timestamp latestLoginDatetime) {
        this.latestLoginDatetime = latestLoginDatetime;
    }
}
