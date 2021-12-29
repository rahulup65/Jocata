package com.learn.controllers;


import com.learn.models.User;
import com.learn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//                   data return in the form of json formate there is no concept of view
@RequestMapping("/users")//         whatever url passing here with the help of this url we can access  this class
public class UserController {

    @Autowired
    private UserService userService;

    // >>>>>>>>>>>>>>>>>>>>>>>all user<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @GetMapping("/")
    public List<User> getAllUsers(){

        return this.userService.getAllUsers();
    }




    //<<<<<<<<<<<<<<<<<<< return only single user>>>>>>>>>>>>>>>>>>>>>>>>.
    //@PreAuthorize("hasRole('ADMIN')")// whatever we were doing from the antmatcher we can do from here also with help of this annotations
    @GetMapping("/{username}")
    public User getUser( @PathVariable("username") String username){

        return this.userService.getUser(username);
    }


    @PostMapping("/")
    public User add(@RequestBody User user){ // data coming from the client will be in json formate and it will d-serialized in user formate with the help of @ResponseBody annotations

        return this.userService.addUser(user);
    }

}
