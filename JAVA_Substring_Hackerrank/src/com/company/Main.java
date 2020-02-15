package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String S = in.next();
            int start = in.nextInt();
            int end = in.nextInt();
            String subStr = S.substring(start, end);
            System.out.println(subStr);
        }
}
