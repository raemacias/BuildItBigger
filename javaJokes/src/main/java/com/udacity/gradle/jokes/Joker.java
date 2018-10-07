package com.udacity.gradle.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Joker {

//    public String getJoke() {
//
//        return "Are you ready for a funny joke?";
//    }

        private List<String> jokes;

    public Joker() {

        jokes = new ArrayList<>();

        jokes.add("Why did the kid cross the playground? To get to the other slide.");
        jokes.add("What did one cookie say to the other? Man, I feel crumby.");
        jokes.add("What do you call a fish with no eye? Fsh.");
    }

    public String getJoke() {

        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size() -1));


    }


}
