package com.hangman_project;

import java.util.ArrayList;
import java.util.List;

public class RandomWordsUtils {
    private static List<String> words = new ArrayList<>();

    //need a constructor that will handle what happens if no words left

    static {
        words.add("Apple");
        words.add("Boat");
        words.add("Cow");
        words.add("Dog");
        words.add("Elephant");
        words.add("Funfair");
        words.add("Garage");
        words.add("Hotel");
        words.add("Igloo");
        words.add("Juggle");
        words.add("King");
        words.add("Llama");
        words.add("Mother");
        words.add("November");
        words.add("Octopus");
        words.add("Princess");
        words.add("Question");
        words.add("Robot");
        words.add("Software");
        words.add("Trainee");
        words.add("Universe");
        words.add("Vacation");
        words.add("Water");
        words.add("Yoga");
        words.add("XMen");
        words.add("Zoology");
    }


    public static String getRandomWord(){
        int randomIndex = (int)(Math.random() * words.size());
        return words.get(randomIndex);
    }
}