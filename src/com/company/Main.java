package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        1. Allow user input of a number (guess)
        2. Tell the user if their guess is to high or too low.
        3. Allow for 5 chances, if the number isn't guessed tell them what it is.
        4. if the number is guessed, congratulate them.
        5. Allow the user to play again.
        */
        int higher = 100;
        int lower = 0;
        int random = (int) (Math.random() * 50 + 1);
        int attempts = 0;
        int attemptLimit = 5;

        System.out.println("Guess a number between 0 and 100: ");

        Scanner scan = new Scanner(System.in);
        int userGuess = scan.nextInt();

        System.out.println(userGuess);

        do {
            if (userGuess > random) {
                System.out.println("Guessed too high!");
            } else if (userGuess < random) {
                System.out.println("Guessed too low!");
            } else if (userGuess == random); {
                System.out.println("you won!");
            }
        } while (attempts == 0);






//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your guess: ");
//        int userGuess = input.nextInt();
//
//        int generatedNumber = (int) Math.ceil(Math.random() * 100);
//
//        if (userGuess > generatedNumber) {
//            System.out.println("Your number is too high!");
//        } else if (userGuess < generatedNumber){
//            System.out.println("Your number is too low!");
//        }
//
//
    }
}
