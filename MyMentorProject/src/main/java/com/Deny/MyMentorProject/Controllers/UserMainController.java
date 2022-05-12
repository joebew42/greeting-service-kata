package com.Deny.MyMentorProject.Controllers;

import com.Deny.MyMentorProject.Services.UserService;
import com.Deny.MyMentorProject.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserMainController {

    @Autowired
UserService userService;

    public UserMainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
   public String helloMessage() {

        return userService. helloMessage();
    }

    @GetMapping("/greetUser")
    public String helloUser() {

        return "hello  " + userService.helloUser();
    }
   @PostMapping("greetings" )
  public String messageToReturn(@RequestBody String requestMessage ){
       System.out.println("requestMessage = " + requestMessage);
       return userService.messageToReTurn( requestMessage);

   }
}