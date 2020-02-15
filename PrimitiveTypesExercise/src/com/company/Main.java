package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                int i = 4;
                double d = 4.0;
                String s = "HackerRank ";

                Scanner scanner = new Scanner(System.in);

                int myInt = scanner.nextInt();
                Double myDouble = scanner.nextDouble();
                scanner.nextLine();
                String myStr = scanner.nextLine();

                System.out.println(myInt + i);
                System.out.println(myDouble + d);
                System.out.println(s + myStr);


    }
}
