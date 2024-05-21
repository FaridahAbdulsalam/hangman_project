package com.hangman_project;

public class GuessHandler {

//method for hiding word
    public static String hideLetters(String word){
        return word.replaceAll("[a-zA-Z]", "_");
    }
//method for revealing letters
    public static String revealLetters(String randomWord, String hiddenWord, String guess){
        char guessedLetter = guess.toLowerCase().charAt(0);
        char[] hiddenWordsArray = hiddenWord.toCharArray(); //changes the hidden word into a character array, so it can iterate through

        //Iteration
        for (int i = 0; i < randomWord.length(); i++ ){
            if(randomWord.toLowerCase().charAt(i) == guessedLetter){
                hiddenWordsArray[i] = guessedLetter;
            }
        }
        String updatedHiddenWord = new String(hiddenWordsArray);
        return updatedHiddenWord;
    }

}
