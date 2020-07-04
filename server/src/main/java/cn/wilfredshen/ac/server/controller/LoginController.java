package cn.wilfredshen.ac.server.controller;

import cn.wilfredshen.ac.server.entity.User;
import cn.wilfredshen.ac.server.result.Result;
import cn.wilfredshen.ac.server.result.ResultFactory;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;

import java.util.Objects;

@RestController
public class LoginController {

    @CrossOrigin
    @PostMapping("/api/login")
    public Result login(@RequestBody @NotNull User user) {
        System.out.println(user);
        String username = user.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals(username, "admin") || !Objects.equals(user.getPassword(), "123456")) {
            return ResultFactory.buildFailResult("用户名或密码错误");
        } else {
            return ResultFactory.buildSuccessResult(username);
        }
    }
}
