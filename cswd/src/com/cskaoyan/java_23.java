package com.cskaoyan;

public class java_23 {
    public static void main(String[] args){
        int[] arr = new int[21];
        float sum = 0;
        arr[0] = 1;
        arr[1] = 2;
        for (int i=2;i<21;++i){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i=0;i<20;++i){
            sum += (float)arr[i+1]/arr[i];
        }
        System.out.println(sum);
    }
}
