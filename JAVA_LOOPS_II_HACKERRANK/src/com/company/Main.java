package com.company;

import java.util.Scanner;

class Main{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        if (0 <= t && t <= 500){
            for(int i=0;i<t;i++){
                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                if (0 <= a && a <= 50 && 0 <= b && b <= 50 && 1<=n && n <=15 ){
                    int sum = a + b;
                    System.out.print(sum);
                    for (int j=1; j< n; j++) {
                        sum = sum + (b * (int)Math.pow(2, j));
                        System.out.print(" " + sum);
                    }
                    System.out.println();
                }
            }
        }
       in.close();
    }
}



