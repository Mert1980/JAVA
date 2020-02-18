package com.company;

import java.util.Scanner;

public class Main {
    static boolean isAnagram(String a, String b) {
        // First lowercase the given strings
        a = a.toLowerCase();
        b = b.toLowerCase();
        // Then concat 2 strings to check the frequency of chars
        String concatted = a.concat(b);
        // Set the counter to zero
        int count = 0;
        // if the length of the strings are equal continue further checks
        if (a.length() == b.length()){
            // I used nested loops to check every char with the rest of the chars.
            // The main idea is; if two given words are anagrams, then the minimum number of frequency
            // should be the multiples of 2, so even numbers. After the inner loop is completed, I checked
            // the countes is even or odd. If it is odd number, then the given two words can not be anagrams
            for(int i=0; i<concatted.length();i++){
                count = 0;
                for(int j=0; j<concatted.length();j++){
                    if (concatted.charAt(i)==concatted.charAt(j)){
                      count++;
                    }
                }
                if (0 != (count % 2)){
                    return false;
                }
            }
        } else {
          return false;
        }
        return true;
    }
// hellohello
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
