package com.cskaoyan;

public class java_29 {
    public static void main(String[] args){
        int[][] arr = new int[10][21];
//        for(int i=0;i<10;++i)
//            for(int j=0;j<10;++j)
//                System.out.println(arr[i][j]);
        arr[0][10] = 1;
        for(int i=1;i<10;++i){
            for(int j=1;j<20;++j){
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
            }
        }
        for(int i=0;i<10;++i){
            for(int j=0;j<21;++j)
                if(arr[i][j]==0)
                    System.out.print(" ");
                else
                    System.out.print(arr[i][j]);
            System.out.println();
        }
    }
}
