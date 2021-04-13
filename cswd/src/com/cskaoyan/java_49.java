package com.cskaoyan;

import java.util.Scanner;
import java.util.ArrayList;

public class java_49 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        int[] arr = new int[n];

        for(int i=0;i<n;++i)
            arr[i] = i+1;
        for(int i=0;i<n;++i)
            System.out.print(arr[i] + " ");
        int count = 1;

        int i = 0;
        int p = 0;
        while(true){
            if(arr[i%n]==0){
                i++;
                continue;
            }
            else if((count++%3==0) && (arr[i%n]!=0)){
                p = arr[i%n];
                arr[i%n] = 0;
            }
            int count_2 = 0;
            for(int j=0;j<n;++j){
                if(arr[j]==0)
                    ++count_2;
            }
            if(count_2==n)
                break;
            i++;
        }
        System.out.println("\n" + p);
    }
}
