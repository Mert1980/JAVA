package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String S = scan.next();

        int count = 0;

        for (int i=0; i<S.length()-1; i++){
            System.out.println(S.substring(i, i+2));
            if (S.substring(i, i+2).equals("hi")){
               count+=1;
            }
        }
        System.out.println(count);
       }
    }

/*    Return the number of times that the string "hi" appears anywhere in the given string.
        countHi("abc hi ho") → 1
        countHi("ABChi hi") → 2
        countHi("hihi") → 2
*/
