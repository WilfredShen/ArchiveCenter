package cn.wilfredshen.ac.server.result;

import org.jetbrains.annotations.NotNull;

/**
 * @author WilfredShen
 */
public enum ResultCodeEnum {
    /**
     * 操作成功
     */
    SUCCESS(200),

    /**
     * 操作失败
     */
    FAIL(400),

    /**
     * 用户未登陆验证
     */
    UNAUTHORIZED(401),

    /**
     * 资源不存在
     */
    NOT_FOUND(404),

    /**
     * 服务器错误
     */
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCodeEnum(int code) {
        this.code = code;
    }

    ResultCodeEnum(@NotNull ResultCodeEnum codeEnum) {
        this.code = codeEnum.code;
    }
}
