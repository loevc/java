package com.cskaoyan;

import java.util.Scanner;

public class java_47 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input length: ");
        int n = s.nextInt();
        int[] arr = new int[n+1];
        System.out.println("input data(sorted) :");
        for(int i=0;i<n;++i)
            arr[i] = s.nextInt();
        for(int i=0;i<n+1;++i)
            System.out.print(arr[i] + " ");
        System.out.println("input insert number: ");
        int p = s.nextInt();

        if(arr[0]>arr[n-1])
            for(int i=n-1;i>=0;--i){
                if(p>arr[i])
                    arr[i+1] = arr[i];
                else{
                    arr[i+1] = p;
                    break;
                }
            }
        else
            for(int i=n-1;i>=0;--i){
                if(p<arr[i])
                    arr[i+1] = arr[i];
                else{
                    arr[i+1] = p;
                    break;
                }
            }
        for(int i=0;i<n+1;++i)
            System.out.print(arr[i] + " ");
    }
}
