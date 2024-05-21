package com.hangman_project;

public class HangmanGame {
    public static void main(String[] args) {
        //variables
        String randomWord = RandomWordsUtils.getRandomWord();
        HangmanCommandRunner hangman = new HangmanCommandRunner(randomWord);
        hangman.start();
    }
}
