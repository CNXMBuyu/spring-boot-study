package cn.hgy.springboot.part1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/part1")
public class Part1RestController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
