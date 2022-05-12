package com.Deny.MyMentorProject.Services;

import com.Deny.MyMentorProject.User.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    User user;


    public UserService(User user) {
        this.user = user;
    }


    public String helloMessage() {
        return "Hello My Friend !";}

    public String helloUser() {
                user.setName("Joe");
        return "hello  " + user.getName();
    }
    public String messageToReTurn(String messagerequest) {

        String reply = "";

        user.setName("Joe");
        if (messagerequest ==""){
            reply = "hello " + user.getName();
        }
        else if (messagerequest ==" happy Message") {
            reply = "Hey  " + user.getName() + " nice to see you here !!";
        }
        else if (messagerequest =="welcome me") {

            reply = user.getName() +" welcome back !!";
        } else if (messagerequest=="bye message") {
            reply= "Have a splendid day "+user.getName();

        }
        System.out.println("messagerequest = " + messagerequest);
        return reply;
    }


    }




