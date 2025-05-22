package com.aarontumbs.numberguessinggame;

import java.util.Random;

public class GameService {
    private GameInputHandler gameInputHandler;
    private GameDisplayHandler gameDisplayHandler;
    private int currentAttemptNumber = 1;
    String result;

    public GameService() {
        this.gameInputHandler = new GameInputHandler();
    }

    public GameConfiguration createGameConfiguration() {

        int maxNumber = gameInputHandler.promptForInt("Please enter the maximum number you would like to guess: ");
        int maxGuesses = gameInputHandler.promptForInt("Please enter the maximum number of guesses you would like to have: ");
        int targetNumber = new Random().nextInt(maxNumber) + 1;

        return new GameConfiguration(maxNumber, maxGuesses, targetNumber);
    }

    public String evaluateGuess(int guessedNumber, int targetNumber) {
        if (guessedNumber < targetNumber) return "Higher";
        if (guessedNumber > targetNumber) return "Lower";
        return "Correct";
    }

    public GuessAttempt guessAttempt(GameConfiguration gameConfiguration) {
        int guessedNumber = gameInputHandler.promptForInt("Please enter a number from 1 to " + gameConfiguration.getMaxNumber() + ": ");
        int getAttemptNumber = currentAttemptNumber++;

        String getResult = evaluateGuess(guessedNumber, gameConfiguration.getTargetNumber());

        return new GuessAttempt(guessedNumber, getAttemptNumber, getResult);
    }

//    public void displayGameConfiguration(GameConfiguration gameConfiguration) {
//        gameDisplayHandler.displayGameConfiguration(gameConfiguration);
//    }

    public void cleanup() {
        gameInputHandler.closeScanner();
    }
}
