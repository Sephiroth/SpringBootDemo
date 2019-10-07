package com.example.controllers;

import com.example.Model.User;
import com.example.Service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

@RestController
@RequestMapping(value = "/api/users")
public class UserController {
    @Resource
    UserService service;

    @ApiOperation(value = "添加用户",httpMethod = "POST") // 接口描述
    @RequestMapping(value = "/user", method = RequestMethod.POST,produces = "application/json")
    public int AddUser(@RequestBody User user) {
        return service.addUser(user);
    }

    //@RequestMapping(value = "/{id}", method = RequestMethod.GET,produces = "application/json")
    @ApiOperation(value = "获取用户",httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id",value="用户id")
    })
    //@ApiResponse()
    @GetMapping(value = "/{id}")
    public @ResponseBody User GetUser(@PathVariable int id) {
        return User.builder().id(id).username("lutao").sex("男").email("123456").createDate(new Date()).build();
    }
}
