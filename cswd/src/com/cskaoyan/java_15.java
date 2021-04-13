package com.cskaoyan;

import java.util.Scanner;

public class java_15 {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int x = s.nextInt();
            int y = s.nextInt();
            int z = s.nextInt();
            s.close();

            if (x>y){
                x = x + y;
                y = x - y;
                x = x - y;
            }
            if (x>z){
                x = x + z;
                z = x - z;
                x = x - z;
            }
            if (y>z){
                y = y + z;
                z = y - z;
                y = y - z;
            }

            System.out.println(x + " " + y + " " + z);
        }

//        public static void swap(int a, int b){
//            a = a + b;
//            b = a - b;
//            a = a - b;
//        }
}
