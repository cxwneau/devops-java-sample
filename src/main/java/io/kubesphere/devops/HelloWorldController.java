package io.kubesphere.devops;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 */
@RestController
@EnableAutoConfiguration
public class HelloWorldController {

    @RequestMapping("/")
    public String sayHello() {
        return "你好，我是小黑哥！";
    }
}
