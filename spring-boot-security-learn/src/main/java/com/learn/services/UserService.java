package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service// it will provide the component object
public class UserService {


    List<User> list=new ArrayList<User>();

    public UserService() {
        list.add(new User("abc", "abc", "ABC@GMAIL.com"));
        list.add(new User("abc", "abc", "ABC@GMAIL.com"));

    }

    //>>>>>>>>>>>>>get all the users <<<<<<<<<<<<<<<<<<<<<<//

    public List<User> getAllUsers() {

        return this.list;
    }

    //>>>>>>>>>>>>>>>>>>>get the single user<<<<<<<<<<<<<<<<<<<<<//


    public User  getUser(String username){

        return  this.list.stream().filter((user)->user.getUsername().equals(username)).findAny().orElse(null);

    }

    //>>>>>>>>>>>>>>>>>>>>add user>>>>>>>>>>>>>>>>>>>>>>>>>>>>>//



    public User addUser(User user){

        list.add(user);
        return user;

    }




}
