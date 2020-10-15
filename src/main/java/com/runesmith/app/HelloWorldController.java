package com.runesmith.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Robert Barr
 */
@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hi mum";
    }
}
