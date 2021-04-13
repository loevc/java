package com.cskaoyan;

public class java_17 {
    public static void main(String[] args){
        for(int i=1;i<10;++i){
            for(int j=1;j<=i;++j)
                System.out.print(i + "*" + i + "=" + i*i + " ");
            System.out.println();
        }
    }
}
