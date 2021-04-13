package com.cskaoyan;

import java.util.Scanner;

public class java_45 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        System.out.println(factorial(n));

    }

    public static int factorial(int n){
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
