package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        int dogCount = 0;
        int catCount = 0;

        for (int i = 0; i < S.length()-2; i++) {
            if ((S.substring(i, i + 3)).equals("dog")) {
                dogCount++;
            } else if ((S.substring(i, i + 3)).equals("cat")) {
                catCount++;
            }
        }
        if (catCount == dogCount) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

 */