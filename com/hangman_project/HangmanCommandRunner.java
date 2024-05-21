package com.hangman_project;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HangmanCommandRunner {

    public static final String QUIT = "quit";

    //variables to store input
    private Scanner scanner = new Scanner(System.in);
    private String randomWord;
    private String hiddenWord;
    private int livesLeft;
    private List<Character> guessedLetters = new ArrayList<>();

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
    public String start() {
        System.out.println("Welcome to my Hangman game!");

        while (livesLeft > 0 && !hiddenWord.equals(randomWord)) {
            System.out.println("Lives Left: " + livesLeft);
            System.out.println("Your Word: " + hiddenWord + " is " + randomWord.length() + " letters long.");
            System.out.println("Guessed Letters: " + guessedLetters);//shows empty array on start
            System.out.println("Please enter a letter to begin guessing: ");

            String guess = scanner.nextLine().toLowerCase();
            char guessedLetter = guess.charAt(0);

            if(guessedLetters.contains(guessedLetter)){
                System.out.println("Whoops, you have already guessed that letter, be careful!");
                continue;
            }

            guessedLetters.add(guessedLetter);


            if (randomWord.contains(guess)) {
                hiddenWord = GuessHandler.revealLetters(randomWord, hiddenWord, guess);
                System.out.println("Well done, keep going!" + hiddenWord);
            } else {
                livesLeft--;
                System.out.println("Bad luck, you now have: " + livesLeft + " lives left");
            }

            if (hiddenWord.equals(randomWord)) {
                System.out.println("Amazing! You guessed the word " + randomWord.toUpperCase());
            } else if (livesLeft == 0) {
                System.out.println("OH NO! You've been hanged! The word was: " + randomWord.toUpperCase());
            }
        }


        //Play again
        String playerChoice = readPlayersChoice("Would you like to play again? (Type 'yes' or 'no')");

        if (playerChoice.equals("yes")) {
            resetGame();
            start();
        } else if (playerChoice.equals("no")) {
            System.out.println("Bye! See you again soon");
            System.exit(0);
        } else {
            System.out.println("Error! Please start again");
            System.exit(0);
        }
        return "";
    }

    /**
     * Reads the player's choice as a String. Ignores any empty strings.
     * @param message The message to display to the player.
     * @return The player's choice as a cleaned, lowercased String.
     */

        protected String readPlayersChoice (String message){
            System.out.println(message);


        while (true) {
            String userInput = scanner.nextLine();
            String userInputClean = userInput.trim().toLowerCase();

            if (!userInputClean.equals("")) {
                return userInputClean;
            } else {
                System.out.println("That didn't quite work, please enter 'yes' or 'no'");
            }
        }
    }

        //method to reset game
    private void resetGame(){
        this.randomWord = RandomWordsUtils.getRandomWord().toLowerCase();
        this.hiddenWord = GuessHandler.hideLetters(randomWord);
        this.livesLeft = 7;
        this.guessedLetters.clear();
    }

}

