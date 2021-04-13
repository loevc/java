package com.cskaoyan;

public class java_46 {
    public static void main(String[] args){
         System.out.println(age(5));
    }

    public static int age(int n){
        if(n==1)
            return 10;
        else
            return age(n-1)+2;
    }
}
