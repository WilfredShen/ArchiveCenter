package cn.wilfredshen.ac.server.util;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.validation.constraints.Min;
import java.util.Random;

/**
 * @author WilfredShen
 */
public class RandomStringUtil {

    public static final String DEFAULT_CHAR_SET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    /**
     * 生成随机字符串
     *
     * @param charSet 字符集，若传入 null 或空白字符串则使用默认字符集
     * @param length  随机字符串的长度
     * @return 生成的字符串
     */
    @NotNull
    public static String generateRandomString(@Nullable String charSet, @Min(1) int length) {
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        if (charSet == null) {
            charSet = DEFAULT_CHAR_SET;
        } else {
            charSet = charSet.trim();
            if ("".equals(charSet)) {
                charSet = DEFAULT_CHAR_SET;
            }
        }
        int len = charSet.length();
        for (int i = 0; i < length; i++) {
            sb.append(charSet.charAt(random.nextInt(len - 1)));
        }
        return sb.toString();
    }

    /**
     * 随机生成盐（charSet = "0-9A-Za-z", length = 64）
     *
     * @return 生成的字符串
     */
    @NotNull
    public static String generateSalt() {
        return generateRandomString(DEFAULT_CHAR_SET, 64);
    }
}
