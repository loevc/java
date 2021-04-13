package com.cskaoyan;

import java.util.Scanner;

public class java_37 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input length: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;++i)
            arr[i] = s.nextInt();


        int min_number = 0;
        int max_number = 0;


        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<n;++i){
            if(min>arr[i]){
                min = arr[i];
                min_number = i;
            }
            if(max<arr[i]){
                max = arr[i];
                max_number = i;
            }
        }
        arr[0] = arr[0] + arr[min_number];
        arr[min_number] = arr[0] - arr[min_number];
        arr[0] = arr[0] - arr[min_number];

        arr[n-1] = arr[n-1] + arr[max_number];
        arr[max_number] = arr[n-1] - arr[max_number];
        arr[n-1] = arr[n-1] - arr[max_number];

        for(int i=0;i<n;++i)
            System.out.println(arr[i]);
    }
}
