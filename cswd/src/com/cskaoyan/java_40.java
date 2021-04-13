package com.cskaoyan;

import java.util.Scanner;

public class java_40 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input n : ");
        int n = s.nextInt();
        float sum = 0;
        while(n>0){
            sum += (float) 1/n;
            n -= 2;
        }
        System.out.println(sum);
    }
}
