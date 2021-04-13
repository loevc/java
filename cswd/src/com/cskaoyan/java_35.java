package com.cskaoyan;

import java.util.Scanner;

public class java_35 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=1;i<n+1;++i){
            if(i==1)
                count = 4;
            else if (i==2)
                count *= 7;
            else
                count *= 8;
            sum += count;
            System.out.println("组成" + i + "位数时 有" + count + "个");
        }
        System.out.println("共有" + sum + "个");
    }
}
