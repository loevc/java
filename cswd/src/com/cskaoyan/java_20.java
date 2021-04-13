package com.cskaoyan;

import java.util.Scanner;

public class java_20 {
    public static void main(String[] args){
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println("input date: 例如20210407");
        Scanner s = new Scanner(System.in);
        int date = s.nextInt();
        s.close();
        int days = 0;
        int year = date/10000;
        int month = date%10000/100;
        int day = date%100;
        if (year%4==0&&year%100!=0||year%400==0){
            for(int i=0;i<month-1;++i)
                days += months[i];
            days += day;
            if (month>2)
                days++;
        }
        else{
            for(int i=0;i<month-1;++i)
                days += months[i];
            days += day;
        }
        System.out.println(days);
    }
}
