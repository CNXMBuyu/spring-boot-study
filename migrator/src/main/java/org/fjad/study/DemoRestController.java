package org.fjad.study;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RestController
public class DemoRestController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
