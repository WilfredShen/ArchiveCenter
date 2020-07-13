package cn.wilfredshen.ac.server.result;

import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author WilfredShen
 */
public class ResultFactory {

    public static @NotNull Result buildResult(@NotNull ResultCodeEnum resultCode, @NotNull @Nls String message, @Nullable Object data) {
        return new Result(resultCode, message, data);
    }

    public static @NotNull Result buildSuccessResult(@Nullable Object data) {
        return buildResult(ResultCodeEnum.SUCCESS, "success", data);
    }

    public static @NotNull Result buildSuccessResult(@NotNull String message, @Nullable Object data) {
        return buildResult(ResultCodeEnum.SUCCESS, message, data);
    }

    public static @NotNull Result buildFailResult(@NotNull @Nls String message, @Nullable Object data) {
        return buildResult(ResultCodeEnum.FAIL, message, data);
    }

    public static @NotNull Result buildFailResult(@NotNull ResultCodeEnum resultCode, @NotNull @Nls String message, @Nullable Object data) {
        return buildResult(resultCode, message, data);
    }
}
