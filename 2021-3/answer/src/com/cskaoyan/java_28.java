package com.cskaoyan;

import java.util.Scanner;

public class java_28 {
    public static void main(String[] args){
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("input three numbers:  ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        s.close();
        System.out.println((a>b)?((a>c)?a:c):((b>c)?b:c));
    }
}
