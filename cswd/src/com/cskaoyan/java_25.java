package com.cskaoyan;

import java.util.Scanner;

public class java_25 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input a 12345 number:");
        int a = s.nextInt();
        if (a/10000 == a%10)
            if(a/1000%10 == a%100/10)
                System.out.println("是回文数");

    }
}
