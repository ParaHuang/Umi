package org.example.bbs.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/signUp")
    public String signUp(){//insert
        System.out.println("a user just singed up");
        return "sign up successfully";
    }
    @PostMapping("/signIn")
    public String signIn(String account,String password){//insert
        System.out.println("a user just singed in--"+account+","+password);
        return "login successfully";
    }

    @PatchMapping
    public String changePassword(){
        System.out.println("a user is changing password");
        return "update successfully";
    }

    /*
    //endpoints

    //url:      http://localhost:8080/path/resource
    //http://localhostlocalhost:8080/test1
    @GetMapping("/test1")
    public String test1(){//void:no response
        System.out.println("request from client");
        return "<h1>content from server:test1--get</h1>";
    }

    @PostMapping("/test2")
    public String test2(){
        System.out.println("request from client");
        return "<h1>content from server:test2--post</h1>";
    }

    @PutMapping("/test3")
    public String test3(){
        System.out.println("request from client");
        return "<h1>content from server:test3--put</h1>";
    }

    @DeleteMapping("/test4")
    public String test4(){
        System.out.println("request from client");
        return "<h1>content from server:test4--delete</h1>";
    }

    @PatchMapping("/test5")
    public String test5(){
        System.out.println("request from client");
        return "<h1>content from server:test5--patch</h1>";
    }
    */
}
