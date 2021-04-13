package com.cskaoyan;

import java.util.Scanner;

public class java_31 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        s.close();
        if(a>b){
            a = a + b;
            b = a - b;
            a = a - b;
        }
        if(a>c){
            a = a + c;
            c = a - c;
            a = a - c;
        }
        if(b>c){
            b = b + c;
            c = b - c;
            b = b - c;
        }
        System.out.println(a + " " + b + " " + c);
    }

//    public static void exchange(int a,int b){
//        if(a>b){
//            a = a + b;
//            b = a - b;
//            a = a - b;
//        }
//    }
}
