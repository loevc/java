package com.cskaoyan;

import java.util.Scanner;

public class java_32 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int a = num/1000;
        int b = num%1000/100;
        int c = num%100/10;
        int d = num%10;
        a = (a+5)%10;
        b = (b+5)%10;
        c = (c+5)%10;
        d = (d+5)%10;
        a = a + d;
        d = a - d;
        a = a - d;
        b = b + c;
        c = b - c;
        b = b - c;
        num = a*1000 + b*100 + c*10 + d;
        System.out.println(num);

    }
}
