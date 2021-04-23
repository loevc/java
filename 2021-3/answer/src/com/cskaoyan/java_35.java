package com.cskaoyan;

import java.util.Scanner;

public class java_35 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int count = 0;
        int sum = 0;
        for(int i=1;i<n+1;++i){
            if(i==1)    //个位
                count = 4;
            else if (i==2)  //首位
                count *= 6;
            else
                count *= (n+1-i);
            sum += count;
            System.out.println("组成" + i + "位数时 有" + count + "个");
        }
        System.out.println("共有" + sum + "个");
    }
}
