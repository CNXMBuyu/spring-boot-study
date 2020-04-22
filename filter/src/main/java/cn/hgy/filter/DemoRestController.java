package cn.hgy.filter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RestController
@RequestMapping("/demo")
public class DemoRestController {

    @GetMapping("/test")
    public String test() {
        return "hello";
    }
}
