package cn.wilfredshen.ac.server.result;

public enum ResultCodeEnum {
    SUCCESS(200),
    FAIL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCodeEnum(int code) {
        this.code = code;
    }
}
