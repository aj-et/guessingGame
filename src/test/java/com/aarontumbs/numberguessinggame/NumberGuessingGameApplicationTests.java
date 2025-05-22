package com.aarontumbs.numberguessinggame;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class NumberGuessingGameApplicationTests {
    GameService gameService = new GameService();

    @Test
    void gameConfigurationInitialization() {
        GameConfiguration config = new GameConfiguration(100, 5, 42);

        assertEquals(100, config.getMaxNumber());
        assertEquals(5, config.getMaxGuesses());
        assertEquals(42, config.getTargetNumber());
        assertTrue(config.displayConfiguration().contains("Max Number: 100"));
    }

    @Test
    void guessAttemptStoresValues() {
        GuessAttempt attempt = new GuessAttempt(30, 2, "Lower");

        assertEquals(30, attempt.getGuessedNumber());
        assertEquals(2, attempt.getAttemptNumber());
        assertEquals("Lower", attempt.getResult());
    }

    @Test
    void evaluateGuessReturnsCorrectly() {
        assertEquals("Higher", gameService.evaluateGuess(20, 50));
        assertEquals("Lower", gameService.evaluateGuess(70, 50));
        assertEquals("Correct", gameService.evaluateGuess(50, 50));
    }

}
