package com.cskaoyan;

import java.util.Scanner;

public class java_48 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("input length :");
        int n = s.nextInt();
        System.out.println("input m : ");
        int m = s.nextInt();

        int[] arr = new int[n];
        int[] arr_2 = new int[n];
        for(int i=0;i<n;++i)
            arr[i] = s.nextInt();
        s.close();

        for(int i=0;i<n;++i)
            arr_2[(i+m)%n] = arr[i];

        for(int i=0;i<n;++i)
            System.out.print(arr_2[i] + " ");
    }
}
