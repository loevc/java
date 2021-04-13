package com.cskaoyan;

import java.util.Scanner;

public class java_30 {
    public static void main(String[] args){
        int count = 0;
        Scanner s = new Scanner(System.in);
        int i = s.nextInt();
        s.close();
        while(i%9 == 0){
            i/=9;
            count++;
        }
        System.out.println(count);
    }
}
