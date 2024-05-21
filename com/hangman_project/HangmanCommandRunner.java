package com.hangman_project;
import java.security.PublicKey;
import java.util.Scanner;

public class HangmanCommandRunner {

    public static final String QUIT = "quit";

    //variables to store input
    private Scanner scanner = new Scanner(System.in);
    private String randomWord;
    private String hiddenWord;
    private int livesLeft;

    //constructor
    public HangmanCommandRunner(String randomWord) {
        this.randomWord = RandomWordsUtils.getRandomWord();
        this.hiddenWord = GuessHandler.hideLetters(randomWord);
        this.livesLeft = 7;
    }

    //methods
    public void start(){
        System.out.println("Welcome to my Hangman game!");

        while (livesLeft > 0 && !hiddenWord.equals(randomWord)) {
            System.out.println("Lives Left: " + livesLeft);
            System.out.println("Please enter a letter to begin guessing: ");
            String guess = scanner.nextLine().toLowerCase();

            if(randomWord.contains(String.valueOf(guess))){

            }
        }
    }


    //scanner.close()
}

//STRUCTURE

//constants
//variables
//constructors
//getters and setters
//methods
//toString

//MAIN