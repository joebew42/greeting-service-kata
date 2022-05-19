package com.Deny.MyMentorProject.Controllers;

import com.Deny.MyMentorProject.Services.UserService;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserMainController {

    UserService userService;

    public UserMainController(UserService userService) {

        this.userService = userService;
    }

    //Welcome message
    @GetMapping()
    public String greeting() {

        return userService.greeting();
    }

    //greeting with name specified
    @GetMapping("/greet")
    public String helloUserWithName(@RequestParam("name") String name) {

        return "hello  " + name;
    }

    /***
     *
     * @param name this is the request param AND i have made it not to be mandatory
     * @return Iam returning random  messages to the user and if user is not specified
     * in  the request param the default value is User
     */
    @GetMapping("/randomGreetings")
    public String randomGreetings(@RequestParam(value = "name"
            , required = false,
            defaultValue = "User") String name) {

        return userService.messagesToReturnRandomly(name);

    }

    @GetMapping("/TimeBasedGreetings")
    public String massageBasedOnTime(@RequestParam(value = "name") String name) {

        return userService.massageBasedOnTime(name);
    }


}