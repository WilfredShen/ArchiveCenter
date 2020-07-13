package cn.wilfredshen.ac.server.mapper;

import cn.wilfredshen.ac.server.dto.base.UserBaseDTO;
import cn.wilfredshen.ac.server.dto.user.UserDTO;
import cn.wilfredshen.ac.server.dto.user.UserLoginDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author WilfredShen
 */
@Repository
@Mapper
public interface UserMapper {

    /**
     * 添加一条用户记录
     *
     * @param userDTO 待添加记录
     * @return 添加成功返回 true，否则返回 false
     * @throws Exception 添加操作异常
     */
    boolean register(UserDTO userDTO) throws Exception;

    /**
     * 用户登录，更新最近登陆时间
     *
     * @param userBaseDTO 待更新用户
     * @return 更新成功返回 true，否则返回 false
     * @throws Exception 更新操作异常
     */
    boolean login(UserBaseDTO userBaseDTO) throws Exception;

    /**
     * 根据用户名获取密码和盐
     *
     * @param username 用户名
     * @return 密码和盐
     * @throws Exception 查找操作异常
     */
    UserLoginDTO getPasswordAndSaltByUsername(String username) throws Exception;
}
