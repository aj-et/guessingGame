package com.aarontumbs.numberguessinggame;

public class GameDisplayHandler {

//    public void displayGameConfiguration(GameConfiguration config) {
//        System.out.println("Game Configuration:");
//        System.out.println(config.displayConfiguration());
//    }

    public void displayGuessResult(GuessAttempt attempt) {
        System.out.println("Attempt #" + attempt.getAttemptNumber() + ": You guessed " + attempt.getGuessedNumber() + " — " + attempt.getResult());
    }

    public void displayWinMessage() {
        System.out.println("Congratulations! You guessed the correct number!");
    }

    public void displayLoseMessage(int targetNumber) {
        System.out.println("You're out of guesses. The correct number was: " + targetNumber);
    }

    public void displayPromptStart() {
        System.out.println("Welcome to the Number Guessing Game!\n");
    }
}