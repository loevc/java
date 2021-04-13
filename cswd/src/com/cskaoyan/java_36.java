package com.cskaoyan;

import java.util.Scanner;

public class java_36 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        for(int i=1;i<8;++i){
            int a = s.nextInt();
            for(int j=0;j<a;++j)
                System.out.print("*");
            System.out.println();
        }
    }
}
