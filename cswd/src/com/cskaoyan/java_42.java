package com.cskaoyan;

import java.util.Scanner;

public class java_42 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        System.out.println("第" + n +  "个月的兔子数量是" + fabonacci(n));

    }

    public static int fabonacci(int n){
        if(n==1)
            return 1;
        else if(n==2)
            return 1;
        else
            return fabonacci(n-1)+fabonacci(n-2);
    }
}
