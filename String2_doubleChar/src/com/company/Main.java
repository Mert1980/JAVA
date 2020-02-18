/* Given a string, return a string where for every char in the original, there are two chars.
        doubleChar("The") → "TThhee"
        doubleChar("AAbb") → "AAAAbbbb"
        doubleChar("Hi-There") → "HHii--TThheerree"
*/
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        String newStr = "";

        for (int i = 0; i < S.length(); i++) {
            newStr += S.substring(i, i+1) + S.substring(i, i+1);
        }
        System.out.println(newStr);
    }
}
