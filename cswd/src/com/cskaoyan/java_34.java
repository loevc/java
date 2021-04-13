package com.cskaoyan;

import java.util.Scanner;

public class java_34 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = a%10000000/1000;
        System.out.println(b);
    }
}
