package cn.wilfredshen.ac.server.service.impl;

import cn.wilfredshen.ac.server.dto.base.UserBaseDTO;
import cn.wilfredshen.ac.server.dto.user.UserDTO;
import cn.wilfredshen.ac.server.dto.user.UserLoginDTO;
import cn.wilfredshen.ac.server.mapper.UserMapper;
import cn.wilfredshen.ac.server.service.UserService;
import cn.wilfredshen.ac.server.util.RandomStringUtil;
import cn.wilfredshen.ac.server.util.SecurityUtil;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author WilfredShen
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 用户注册
     *
     * @param userDTO 用户数据
     * @return 注册结果
     */
    @Override
    public boolean register(@NotNull UserDTO userDTO) {
        userDTO.setSalt(RandomStringUtil.generateSalt());
        userDTO.setPassword(SecurityUtil.sha256(userDTO.getPassword()));
        userDTO.setPassword(SecurityUtil.sha256(userDTO.getPassword() + userDTO.getSalt()));
        try {
            return userMapper.register(userDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * 用户登录
     *
     * @param userLoginDTO 用户数据
     * @return 登录结果
     */
    @Override
    public boolean login(@NotNull UserLoginDTO userLoginDTO) {
        try {
            UserLoginDTO data = userMapper.getPasswordAndSaltByUsername(userLoginDTO.getUsername());
            if (data == null) {
                return false;
            }
            String valid = SecurityUtil.sha256(userLoginDTO.getPassword() + data.getSalt());
            if (valid == null) {
                return false;
            }
            return valid.equals(data.getPassword());
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 用户登出
     *
     * @param userBaseDTO 用户数据
     * @return 登出结果
     */
    @Override
    public boolean logout(@NotNull UserBaseDTO userBaseDTO) {
        return true;
    }
}
