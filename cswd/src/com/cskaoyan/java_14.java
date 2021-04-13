package com.cskaoyan;

import static java.lang.Math.sqrt;

public class java_14 {
    public static void main(String[] args){
        for (int i=100;i<=200;++i){
            boolean flag = true;
            for (int j=2;j<=sqrt(i);++j){
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("素数是:%d " + i);
        }
    }
}
