package com.aarontumbs.numberguessinggame;

public class GuessAttempt {
    private int guessedNumber;
    private int attemptNumber;
    private String result;

    public GuessAttempt(int guessedNumber, int attemptNumber, String result) {
        this.guessedNumber = guessedNumber;
        this.attemptNumber = attemptNumber;
        this.result = result;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public String getResult() {
        return result;
    }
}
