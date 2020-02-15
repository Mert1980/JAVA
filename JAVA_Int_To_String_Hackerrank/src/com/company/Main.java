package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String numStr = Integer.toString(9);

        if (num == Integer.parseInt(numStr)){
            System.out.println("Good job");
        } else System.out.println("Wrong answer");
    }
}
