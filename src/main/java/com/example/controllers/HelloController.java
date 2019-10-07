package com.example.controllers;

import com.example.Model.User;
import org.springframework.web.bind.annotation.*;

//@Slf4j
@RestController
@RequestMapping(value = "/api/hello")
public class HelloController {

    //private  static final Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello() {
        //log.info("sayHello:printf()");
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(User user) {
        return user.getUsername();
    }


}