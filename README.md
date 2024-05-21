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

The 4 Pillars of OOP in this project. 

Encapsulation: Each class has its own responsibilities and private attributes which can then be accessed through public methods if needed.
Inheritance is not used in this project as there was no requirement for it.
Polymorphism has not been used but could be implemented in the future for different game levels
Abstraction has been used to keep complex details such as the predefined word lists hidden