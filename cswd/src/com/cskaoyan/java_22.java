package com.cskaoyan;

import java.util.Scanner;

public class java_22 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int n = 0;
        int[] arr = new int[5];
//        int number_bak = number;
        s.close();
        if(number>=10000){
            n=5;
            arr[0] = number/10000;
            arr[1] = number%10000/1000;
            arr[2] = number%1000/100;
            arr[3] = number%100/10;
            arr[4] = number%10;
            number = arr[4]*10000 + arr[3]*1000 + arr[2]*100 + arr[1]*10 + arr[0];
        }
        else if(number>=1000){
            n=4;
            arr[0] = number/1000;
            arr[1] = number%1000/100;
            arr[2] = number%100/10;
            arr[3] = number%10;
            number = arr[3]*1000 + arr[2]*100 + arr[1]*10 + arr[0];
        }
        else if(number>=100){
            n=3;
            arr[0] = number/100;
            arr[1] = number%100/10;
            arr[2] = number%10;
            number = arr[2]*100 + arr[1]*10 + arr[0];
        }
        else if(number>=10){
            n=2;
            arr[0] = number/10;
            arr[1] = number%10;
            number = arr[1]*10 + arr[0];
        }
        else{
            n=1;
        }
        System.out.println("是" + n + "位数");
        System.out.println("逆序之后是 " + number);
    }
}
