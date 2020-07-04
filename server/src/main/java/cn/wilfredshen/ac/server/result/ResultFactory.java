package cn.wilfredshen.ac.server.result;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ResultFactory {

    @Contract(value = "_, _, _ -> new", pure = true)
    public static @NotNull Result buildResult(@NotNull ResultCodeEnum resultCode, @NotNull @Nls String message, @Nullable Object data) {
        return new Result(resultCode.code, message, data);
    }

    @Contract(value = "_, _, _ -> new", pure = true)
    public static @NotNull Result buildResult(int code, @NotNull @Nls String message, @Nullable Object data) {
        return new Result(code, message, data);
    }

    @Contract(value = "_-> new", pure = true)
    public static @NotNull Result buildSuccessResult(@Nullable Object data) {
        return buildResult(ResultCodeEnum.SUCCESS, "success", data);
    }

    @Contract(value = "_-> new", pure = true)
    public static @NotNull Result buildFailResult(@NotNull @Nls String message) {
        return buildResult(ResultCodeEnum.FAIL, message, null);
    }

    @Contract(value = "_, _-> new", pure = true)
    public static @NotNull Result buildFailResult(@NotNull ResultCodeEnum resultCode, @NotNull @Nls String message) {
        return buildResult(resultCode.code, message, null);
    }

    @Contract(value = "_, _-> new", pure = true)
    public static @NotNull Result buildFailResult(int code, @NotNull @Nls String message) {
        return buildResult(code, message, null);
    }

}
