package cn.wilfredshen.ac.server.result;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;

/**
 * @author Wilfred Shen
 * @date 2020-07
 */
public class Result {
    private int code;
    private @NotNull String message;
    private @Nullable Object data;

    public Result(int code, @NotNull @Nls String message, @Nullable Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Result)) return false;
        Result result = (Result) o;
        return code == result.code &&
                message.equals(result.message) &&
                Objects.equals(data, result.data);
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @NotNull
    public String getMessage() {
        return message;
    }

    public void setMessage(@NotNull String message) {
        this.message = message;
    }

    @Nullable
    public Object getData() {
        return data;
    }

    public void setData(@Nullable Object data) {
        this.data = data;
    }
}
