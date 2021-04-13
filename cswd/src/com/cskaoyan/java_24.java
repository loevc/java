package com.cskaoyan;

public class java_24 {
    public static void main(String[] args){
        int sum = 0;
        for(int i=1;i<21;++i)
            sum += recur(i);
        System.out.println(sum);
    }

    public static int recur(int n){
        if (n==1)
            return 1;
        else
            return n*recur(n-1);
    }
}
