package com.cskaoyan;

import java.util.Scanner;

public class java_28 {
    public static void main(String[] args){
        int[] arr = new int[10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;++i){
            arr[i] = s.nextInt();
        }
        for(int i=0;i<10;++i){
            for(int j=i+1;j<10;++j){
                if(arr[i]>arr[j]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        for(int i=0;i<10;++i){
            System.out.println(arr[i]);
        }
    }
}
