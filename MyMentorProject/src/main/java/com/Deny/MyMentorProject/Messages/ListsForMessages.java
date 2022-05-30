package com.Deny.MyMentorProject.Messages;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

@Component
public class ListsForMessages {

    ArrayList<String> greetings;

    public String morningMessages(String name) {
        Random random = new Random();
        greetings = new ArrayList<>(Arrays.asList(
                // **Morning (from 7 AM to 11 AM)** :sunny:
                " Good morning, name!" + name + " The sun is high and shining",
                "Hey " + name,
                name + " welcome back ",
                "Have a splendid day " + name
        ));
        int rand = random.nextInt(greetings.size());
        String randomMessages = greetings.get(rand);
        return randomMessages;
    }

    //The rest of the day (from 12 PM to 8 PM)** :clock3:
    public String restOfTheDayMessages(String name) {
        Random random = new Random();
        greetings = new ArrayList<>(Arrays.asList(
                "Hello" + name,
                "You are great " + name
        ));
        int rand = random.nextInt(greetings.size());
        String randomMessages = greetings.get(rand);
        return randomMessages;
    }

    //- **Night (from 9 PM to 6 AM)** :zzz
    public String nightMessages(String name) {
        Random random = new Random();
        greetings = new ArrayList<>(Arrays.asList(


                "Have a goodnight " + name,
                "Wish you sweet dreams " + name,
                "It was a great day! " + name + "it's time to relax!"
        ));
        int rand = random.nextInt(greetings.size());
        String randomMessages = greetings.get(rand);
        return randomMessages;
    }


}
