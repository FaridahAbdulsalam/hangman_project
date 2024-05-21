package com.hangman_project;

public class GuessHandler {

//method for hiding word
    public static String hideLetters(String word){
        return word.replaceAll("[a-zA-Z]", "_");
    }
//method for revealing letters
    public static String revealLetters(){

    }

}
