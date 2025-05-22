package com.aarontumbs.numberguessinggame;

import java.util.Scanner;

public class GameInputHandler {
    private Scanner scanner;

    public GameInputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public int promptForInt(String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a number: ");
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public void closeScanner() {
        scanner.close();
    }
}
