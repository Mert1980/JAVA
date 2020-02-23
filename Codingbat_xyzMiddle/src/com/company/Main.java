package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String S = scan.next();
	    String T = "";
		String trimmed = S.replace("xyz", "");
		System.out.println(trimmed);

	    for (int i=0; i < trimmed.length(); i++) {
			T = T + trimmed.charAt(i);
			if (i == trimmed.length()/2-1) T = T.concat("xyz");
        }
		if (S.equals(T)) System.out.println("true");
        System.out.println(T);
    }
}
