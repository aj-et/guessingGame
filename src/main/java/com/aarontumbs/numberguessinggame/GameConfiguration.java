package com.aarontumbs.numberguessinggame;

public class GameConfiguration {
    private int maxNumber;
    private int maxGuesses;
    private int targetNumber;

    public GameConfiguration(int maxNumber, int maxGuesses, int targetNumber) {
        this.maxNumber = maxNumber;
        this.maxGuesses = maxGuesses;
        this.targetNumber = targetNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }

    public int getMaxGuesses() {
        return maxGuesses;
    }

    public int getTargetNumber() {
        return targetNumber;
    }

    // For Testing
    public String displayConfiguration() {
        return String.format("Max Number: " + maxNumber + "\nMax Guesses: " + maxGuesses + "\nRandom Number: " + targetNumber);
    }
}
