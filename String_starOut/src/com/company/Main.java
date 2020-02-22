package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        String starOut = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*' ||
               (i > 0 && str.charAt(i - 1) == '*'))
                continue;
            if (i < str.length()-1 &&
                str.charAt(i + 1) == '*')
                continue;

            starOut += str.charAt(i);
        }
        System.out.println(starOut);
    }

}

// starOut("sm***eil*ly") → "siy"
// starOut("*str*in*gy") → "ty"
