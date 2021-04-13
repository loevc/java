package com.cskaoyan;

import java.util.Scanner;

public class java_39 {
    public static void main(String[] args){
        System.out.println("input m");
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        System.out.println("input n");
        int n = s.nextInt();

        if(m<n){
            m = m + n;
            n = m - n;
            m = m - n;
        }
        System.out.println("最大公约数: " + min_factor(m,n));
        System.out.println("最小公倍数: " + m*n/min_factor(m,n));
    }

    public static int min_factor(int m,int n){
        int p;
        if((p=m%n)!=0){
            m = n;
            n = p;
        }
        else
            return n;
        return min_factor(m,n);
    }
}
