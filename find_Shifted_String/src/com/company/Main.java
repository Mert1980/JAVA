package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string1 = scan.next();
        String string2 = scan.next();

        String copyString1 = string1.concat(string1);

        if (string1.length()==string2.length() && copyString1.contains(string2)){
            System.out.println("Her iki string birbirinin kaydirilmis halidir");
        } else {
            System.out.println("Her iki string birbirinin kaydirilmis hali degildir");
        }
    }
}
