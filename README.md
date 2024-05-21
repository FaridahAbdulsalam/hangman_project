# hangman_project

Welcome to my Java Hangman Game.

This game follows the traditional set-up of a hangman game, sans the visual hanging man.
The player is given a random word, and it appears as "_". As the player guesses correctly, the word will reveal itself per correct letter.
For every wrong guess the player loses a life. There are 7 lives, mirroring the 7 body parts that are usually drawn to complete the hangman


The classes all handle a particular part of the game as follows:

HangmanCommandRunner:
This is the largest class in the project. It handles the user input and game logic.

GuessHandler:
As the name suggests, this class contains the methods for hiding the letters in a word and revealing the guessed ones.

HangmanGame:
This is the 'main' class which runs the game by using the start() method from HCR Class

RandomWordsUtils:
This class contains the predefined words and the generate random word method. 
