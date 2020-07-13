package cn.wilfredshen.ac.server.controller;

import cn.wilfredshen.ac.server.dto.base.UserBaseDTO;
import cn.wilfredshen.ac.server.dto.user.UserDTO;
import cn.wilfredshen.ac.server.dto.user.UserLoginDTO;
import cn.wilfredshen.ac.server.result.Result;
import cn.wilfredshen.ac.server.result.ResultFactory;
import cn.wilfredshen.ac.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author WilfredShen
 */
@CrossOrigin
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping("/api/user/register")
    @ResponseBody
    public Result register(@RequestBody UserDTO userDTO) {
        boolean success = userService.register(userDTO);
        if (success) {
            return ResultFactory.buildSuccessResult(null);
        } else {
            return ResultFactory.buildFailResult("register failed", null);
        }
    }

    @PostMapping("/api/user/login")
    @ResponseBody
    public Result login(@RequestBody UserLoginDTO userLoginDTO, HttpSession session) {
        if (session != null) {
            System.out.println(session);
            session.setAttribute("user", userLoginDTO.getUsername());
        }
        boolean success = userService.login(userLoginDTO);
        if (success) {
            return ResultFactory.buildSuccessResult(null);
        } else {
            return ResultFactory.buildFailResult("login failed", null);
        }
    }

    @GetMapping("/api/user/logout")
    @ResponseBody
    public Result logout(UserBaseDTO userBaseDTO) {
        boolean success = userService.logout(userBaseDTO);
        if (success) {
            return ResultFactory.buildSuccessResult(null);
        } else {
            return ResultFactory.buildFailResult("logout failed", null);
        }
    }

    @GetMapping("/api/user/authentication")
    @ResponseBody
    public Result authentication(UserBaseDTO userBaseDTO) {
        return ResultFactory.buildSuccessResult("authentication success", null);
    }
}
