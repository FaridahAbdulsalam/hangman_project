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

    //getters and setters


    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        this.livesLeft = livesLeft;
    }

    //constructor
    public HangmanCommandRunner(String randomWord) {
        this.randomWord = randomWord.toLowerCase();
        this.hiddenWord = GuessHandler.hideLetters(randomWord);
        this.livesLeft = 7;
    }

    //methods
    public void start(){
        System.out.println("Welcome to my Hangman game!");

        while (livesLeft > 0 && !hiddenWord.equals(randomWord)) {
            System.out.println("Lives Left: " + livesLeft);
            System.out.println("Your Word: " + hiddenWord + " is " + randomWord.length() + " letters long.");
            System.out.println("Please enter a letter to begin guessing: ");
            String guess = scanner.nextLine().toLowerCase();


            if(randomWord.contains(guess)){
                hiddenWord = GuessHandler.revealLetters( randomWord, hiddenWord ,guess);
                System.out.println("Well done, keep going!" + hiddenWord);
            } else {
                livesLeft--;
                System.out.println("Bad luck, you now have: " + livesLeft + " lives left");
            }

            if (hiddenWord.equals(randomWord)){
                System.out.println("Amazing! You guessed the word " + randomWord);
            } else if (livesLeft == 0) {
                System.out.println("OH NO! You've been hanged! The word was: " + randomWord);

            }
        }
    }


//    scanner.close()
}

