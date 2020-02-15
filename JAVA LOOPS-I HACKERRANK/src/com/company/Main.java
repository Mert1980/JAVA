package com.company;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();

        if (N >= 2 && N <= 20) {
            for (int i = 1; i <=10; i++) {
                System.out.println(N + " x " + i + " = " + (N*i));
            }
        }

    }
}

