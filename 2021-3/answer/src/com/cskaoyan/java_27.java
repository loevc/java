package com.cskaoyan;

import java.util.Scanner;

public class java_27 {
    public static void main(String[] args){
        int a, b, c;
        int max;
        Scanner s = new Scanner(System.in);
        System.out.println("input three numbers:  ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        s.close();
        if (a > b)
            max = a;
        else
            max = b;
        if (max < c)
            max = c;

        System.out.println(max);

    }
}
