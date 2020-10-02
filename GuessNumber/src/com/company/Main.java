package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        var keyboard = new Scanner(System.in);
        var rand = new Random();
        var numberToGuess = rand.nextInt(100);

        System.out.println("Enter a number:");
        var guessed = false;

        while (!guessed) {
            var guess = keyboard.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if (guess > numberToGuess) {
                System.out.println("Lower!");
            } else {
                System.out.println("Guessed!");
                guessed = true;
            }

        }
        keyboard.close();
    }
}
