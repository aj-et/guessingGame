package com.aarontumbs.numberguessinggame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumberGuessingGameApplication {

    public static void main(String[] args) {
        SpringApplication.run(NumberGuessingGameApplication.class, args);

        GameService gameService = new GameService();
        GameDisplayHandler displayHandler = new GameDisplayHandler();

        try {
            displayHandler.displayPromptStart();

            GameConfiguration config = gameService.createGameConfiguration();
//            displayHandler.displayGameConfiguration(config);

            GuessAttempt attempt;
            do {
                attempt = gameService.guessAttempt(config);
                displayHandler.displayGuessResult(attempt);
            } while (!attempt.getResult().equals("Correct") && attempt.getAttemptNumber() < config.getMaxGuesses());

            if (attempt.getResult().equals("Correct")) {
                displayHandler.displayWinMessage();
            } else {
                displayHandler.displayLoseMessage(config.getTargetNumber());
            }

        } finally {
            gameService.cleanup();
        }
    }
}
