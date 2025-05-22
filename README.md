## JAVA Number Guessing Game Project
This is the number guessing game, where the user will guess the random number from a selected range from 1 to the highest number the user set.

### Task 1:
* Install IntelliJ and make sure that I can run Java
* Create a simple "Hello World" program
* Create the number guessing game
   * There should be a default number
   * User should be able to select the highest number to guess
   * User should be able to select the maximum number of guesses
   * The program will tell if the user should guess a higher or lower number
   * If the user guessed the number before running out of tries, user wins. User lose when number of guesses runs out.

### Task 2:
* Refactor and add unit tests
   * Separate/break down into multiple methods
   * Write at least 2 Unit tests (e.g., a method that checks guess accuracy)
   * Create a README file and push to gitHub

### Task 3:
#### Project Class Structure
1. **Data/Model Classes**
   * GameConfiguration - stores max number, max guesses, generates the random number
   * GuessAttempt - represents the single guess (number guessed, attempt number, result)
   * GameSession - represents one complete game (target number, attempts made, game state)

2. **I/O Classes**
   * GameInputHandler - handles all user input (getting max number, max guesses, individual guesses)
   * GameDisplayHandler - handles all output (welcome messages, guess feedback, results)

3. Service/Logic Classes
   * GameService - coordinates the entire game flow
   * GuessValidator - validates guesses (in range, not duplicate, etc.)

4. Main Class
   * NumberGuessingGameApplication - The main class