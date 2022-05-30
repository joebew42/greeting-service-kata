package com.Deny.MyMentorProject.Services;


import com.Deny.MyMentorProject.Messages.ListsForMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {


    @Autowired
    ListsForMessages listsForMessages;

    public String greeting() {
        return "Hello My Friend !";
    }

    public String helloUser(String name) {

        return "hello  " + name;
    }

    public String messagesToReturnRandomly(String name) {
        Random random = new Random();

        List<String> greetings = new ArrayList();

        greetings.add("Hey " + name);
        greetings.add(name + " welcome back ");
        greetings.add("Have a splendid day " + name);

        // Random r = new Random();

        int rand = random.nextInt(greetings.size());
        String randomMessages = greetings.get(rand);

        return randomMessages;
    }

    public String massageBasedOnTime(String name) {

        LocalTime timeNow = LocalTime.now();
//    LocalTime startTimeNight;
//    LocalTime endTimeNight;

        LocalTime startTimeMorning;
        LocalTime endTimeMorning;
        LocalTime startTimeRestOfDay;
        LocalTime endTimeRestOfday;

        startTimeMorning = LocalTime.parse("06:59:59");
        endTimeMorning = LocalTime.parse("11:59:59");

        startTimeRestOfDay = LocalTime.parse("11:59:59");
        endTimeRestOfday = LocalTime.parse("19:59:59");

//        startTimeNight = LocalTime.parse("19:59:59");
//        endTimeNight = LocalTime.parse("06:59:59");


        if (timeNow.isBefore(endTimeMorning) && timeNow.isAfter(startTimeMorning)) {
            return listsForMessages.morningMessages(name);

        } else if (timeNow.isBefore(endTimeRestOfday) && timeNow.isAfter(startTimeRestOfDay)) {
            return listsForMessages.restOfTheDayMessages(name);

        } else


            return listsForMessages.restOfTheDayMessages(name);
    }
}