package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // overflow
        System.out.println("Busted MAX value = " + (myMaxIntValue - 1)); // underflow

        int myMaxIntTest = 2_147_483_647;
    }
}


