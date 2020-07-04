package cn.wilfredshen.ac.server.controller;

import cn.wilfredshen.ac.server.result.Result;
import cn.wilfredshen.ac.server.result.ResultFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public Result helloworld() {
        return ResultFactory.buildSuccessResult("Hello World!");
    }
}
