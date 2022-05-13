package com.Deny.MyMentorProject.Services;

import com.Deny.MyMentorProject.User.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UserServiceTest {
     private UserService userServiceUnderTest;
     private  User user;
    @BeforeEach
    void setUp() {
        userServiceUnderTest=new UserService(user);
    }
@Test
    void shouldReturnStringHellowWorld(){
//THIS IS FOR J-UNIT 5 JUPITER
    //given
    String hellow="Hello My Friend !";
    //when
    String stringValidity =userServiceUnderTest.helloMessage();
    //then
    assertEquals(hellow,stringValidity);

    }
    @Test
    void shouldReturnStringHellowWorldPlusUserName(){
        user.setName("Joe");
        //GIVEN
        String message= "hello "+ user.getName();
        //WHEN
          String stringValidityTwo =userServiceUnderTest.helloUser();
       //THEN
        assertEquals(message,stringValidityTwo);


    }



}