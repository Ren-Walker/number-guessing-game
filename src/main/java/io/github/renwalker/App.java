package io.github.renwalker;

import java.util.Scanner;

public class App {
    private static final int MAX_ATTEMPTS = 5;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean retry = true;

        System.out.println("Welcome to the Number Guessing Game");
        
        while(retry) {
            playGame(scanner);
            
            System.out.print("Would you like to play again? (Yes/No): ");
            String replay = scanner.next().toLowerCase();
            retry = replay.equals("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }

    private static void playGame(Scanner scanner) {
        int randomNumber = MIN_NUMBER + (int)(Math.random() * MAX_NUMBER);
        int attemptsLeft = MAX_ATTEMPTS;

        while(attemptsLeft > 0) {
            System.out.printf("Please enter a number between %d and %d: ", MIN_NUMBER, MAX_NUMBER);
            
            if(!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
                scanner.next(); 
                continue;
            }

            int guess = scanner.nextInt();
            attemptsLeft--;

            if(guess == randomNumber) {
                String guessText = (MAX_ATTEMPTS - attemptsLeft) == 1 ? "guess" : "guesses";
                System.out.printf("Congratulations! You guessed correctly in %d %s%n", 
                                (MAX_ATTEMPTS - attemptsLeft), guessText);
                return;
            }
            
            String direction = guess < randomNumber ? "higher" : "lower";
            System.out.printf("Incorrect! The number is %s than your guess.%n", direction);
            
            if(attemptsLeft > 0) {
                String attemptText = attemptsLeft == 1 ? "try" : "tries";
                System.out.printf("You have %d %s remaining.%n", attemptsLeft, attemptText);
            }
        }
        
        System.out.printf("Sorry, you're out of attempts! The number was %d.%n", randomNumber);
    }
}