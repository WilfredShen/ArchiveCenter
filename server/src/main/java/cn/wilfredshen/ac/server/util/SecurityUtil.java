package cn.wilfredshen.ac.server.util;

import cn.wilfredshen.ac.server.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.util.HtmlUtils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author WilfredShen
 */
public class SecurityUtil {

    private static final String SHA256 = "SHA-256";
    private static final String MD5 = "MD5";
    private static final String HEX = "0123456789ABCDEF";

    /**
     * 进行转义，防止XSS攻击
     *
     * @param user 用户数据
     */
    public static void escape(@NotNull User user) {
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);
        user.setUsername(username);

        String password = user.getPassword();
        password = HtmlUtils.htmlEscape(password);
        user.setPassword(password);

        String realname = user.getRealname();
        if (realname != null) {
            realname = HtmlUtils.htmlEscape(realname);
            user.setRealname(realname);
        }

        String email = user.getEmail();
        if (email != null) {
            email = HtmlUtils.htmlEscape(email);
            user.setEmail(email);
        }
    }

    /**
     * 通过 SHA256 算法进行加密，返回长度为 64 的字符串
     *
     * @param string 待加密字符串
     * @return 加密字符串
     */
    public static String sha256(String string) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SHA256);
            return byte2Hex(messageDigest.digest(string.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String byte2Hex(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b: bytes) {
            sb.append(HEX.charAt(0xF & (b >> 4)));
            sb.append(HEX.charAt(0xF & b));
        }
        return sb.toString();
    }
}
