package com.cskaoyan;

import  java.util.Scanner;

public class java_33 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input the length of array:");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("input elements: ");
        for(int i=0;i<n;++i)
            arr[i] = s.nextInt();
        s.close();

        for(int i=0;i<n/2;++i){
            arr[i] = arr[i] + arr[n-1-i];
            arr[n-1-i] = arr[i] - arr[n-1-i];
            arr[i] = arr[i] - arr[n-1-i];
        }

        for(int i=0;i<n;++i)
            System.out.println(arr[i] + " ");
    }
}
