package com.hangman_project;

public class RandomWords {
    private RandomWordsUtils randomWords;

    //constructor
    public RandomWords(RandomWordsUtils randomWords) {
        this.randomWords = randomWords;
    }

    //method to get random word
    public String getRandomWord(){
        //being called from RandomWordUtils
        return RandomWordsUtils.getRandomWord();
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