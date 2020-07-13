package cn.wilfredshen.ac.server.entity;

import org.jetbrains.annotations.NotNull;

/**
 * @author WilfredShen
 */
public class Document {

    /**
     * file id
     */
    @NotNull
    private Integer fid = 0;

    /**
     * user id
     */
    @NotNull
    private Integer uid = 0;

    /**
     * file name
     * path + name = 绝对路径
     */
    @NotNull
    private String filename = "";

    /**
     * base path<br/>
     * path + name = 绝对路径
     */
    @NotNull
    private String filepath = "";

    /**
     * validation (SHA256)
     */
    @NotNull
    private String valid = "";

    @NotNull
    public Integer getFid() {
        return fid;
    }

    public void setFid(@NotNull Integer fid) {
        this.fid = fid;
    }

    @NotNull
    public Integer getUid() {
        return uid;
    }

    public void setUid(@NotNull Integer uid) {
        this.uid = uid;
    }

    @NotNull
    public String getFilename() {
        return filename;
    }

    public void setFilename(@NotNull String filename) {
        this.filename = filename;
    }

    @NotNull
    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(@NotNull String filepath) {
        this.filepath = filepath;
    }

    @NotNull
    public String getValid() {
        return valid;
    }

    public void setValid(@NotNull String valid) {
        this.valid = valid;
    }
}
