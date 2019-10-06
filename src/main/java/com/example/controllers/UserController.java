package com.example.controllers;

import com.example.dao.User;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {

    @ApiOperation(value = "添加用户",httpMethod = "POST")
    @RequestMapping(value = "/user", method = RequestMethod.POST,produces = "application/json")
    public boolean AddUser(@RequestBody User user) {
        return  false;
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = "application/json")
    @ApiOperation(value = "获取用户",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户id")
    })
    //@ApiResponse()
    @GetMapping(value = "/{id}")
    public User GetUser(@PathVariable int id) {
        return User.builder().id(id).username("lutao").sex("男").email("123456").build();
    }
}
