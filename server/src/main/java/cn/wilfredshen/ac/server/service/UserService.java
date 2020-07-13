package cn.wilfredshen.ac.server.service;

import cn.wilfredshen.ac.server.dto.base.UserBaseDTO;
import cn.wilfredshen.ac.server.dto.user.UserDTO;
import cn.wilfredshen.ac.server.dto.user.UserLoginDTO;
import org.jetbrains.annotations.NotNull;

/**
 * @author WilfredShen
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param userDTO 用户数据
     * @return 注册成功返回 true，否则返回 false
     */
    boolean register(@NotNull UserDTO userDTO);

    /**
     * 用户登录
     *
     * @param userLoginDTO 用户数据
     * @return 登录成功返回 true，否则返回 false
     */
    boolean login(@NotNull UserLoginDTO userLoginDTO);

    /**
     * 用户登出
     *
     * @param userBaseDTO 用户数据
     * @return 登出成功返回 true，否则返回 false
     */
    boolean logout(@NotNull UserBaseDTO userBaseDTO);
}
