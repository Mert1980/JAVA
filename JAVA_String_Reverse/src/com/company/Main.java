package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String A = sc.next();

//        System.out.println(A.charAt(0));

        int length = A.length();

//        System.out.println(A.charAt(length-1));

        boolean palindrome = true;

        if (A.charAt(0) == (A.charAt(length-1))) {
            System.out.println("last letters are same");
            for (int i = 1; i<length; i++){
                if (A.charAt(i) != A.charAt(length-i-1)){
                    palindrome = false;
                }
            }
        } else palindrome = false;

        if (palindrome || length == 1){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
