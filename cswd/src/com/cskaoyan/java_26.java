package com.cskaoyan;

import java.util.Scanner;

public class java_26 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);
        switch (c){
            case 'm':
                System.out.println("星期一");
                break;
            case 't':
                System.out.println("input second chacters: ");
                char c2 = s.next().charAt(0);
                if (c2 == 'u')
                    System.out.println("星期二");
                else
                    System.out.println("星期四");
                break;
            case 'w':
                System.out.println("星期三");
                break;
            case 'f':
                System.out.println("星期五");
                break;
            case 's':
                System.out.println("input second chacters: ");
                char c3 = s.next().charAt(0);
                if (c3 == 'a')
                    System.out.println("星期六");
                else
                System.out.println("星期日");
                break;
        }
    }
}
