package com.hangman_project;

public class HangmanGame {
    public static void main(String[] args) {
        //variables
        String randomWord = RandomWordsUtils.getRandomWord();
        String hiddenRandomWord = GuessHandler.hideLetters(randomWord);
        System.out.println("Your Word: " + hiddenRandomWord);
    }
}


//STRUCTURE

//constants
//variables
//constructors
//getters and setters
//methods
//toString

//MAIN