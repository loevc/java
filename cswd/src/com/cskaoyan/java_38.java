package com.cskaoyan;

import java.util.Scanner;

public class java_38 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input a ");
        int a = s.nextInt();
        System.out.println("input b ");
        int b = s.nextInt();
        int sum = 0;
        int temp = 0;

        for(int i=0;i<b;++i){
            temp += a*Math.pow(10,i);
            sum += temp;
        }
        System.out.println(sum);
    }
}
