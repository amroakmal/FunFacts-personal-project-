package com.example.funfacts;

import java.util.Random;

class FactBook {
    private static String[] facts = {"On average, it takes 66 days to form a new habit.",
            "Some penguins can leap 2-3 meters out of the water.",
            "The state of Florida is bigger than England.",
            "Ostriches can run faster than horses",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth."};

    String getFact(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts[randomNumber];
    }

}
