package com.cskaoyan;

public class java_16 {
    public static void main(String[] args){
        for(int i=1;i<5;++i){
            for(int j=0;j<4-i;++j)
                System.out.print(" ");
            for(int j=0;j<2*i-1;++j)
                System.out.print("*");
            System.out.println("\n");
        }
    }
}
