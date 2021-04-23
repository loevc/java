package com.cskaoyan;

import java.util.Scanner;

public class java_31 {
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        s.close();
        if(a % 2 == 1)
            System.out.println("是奇数");
        else
            System.out.println("是偶数");
    }
}
