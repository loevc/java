package com.cskaoyan;

public class java_13 {
    public static void main(String[] args){
        int a,b,c;
        int i;
        for (i=100;i<1000;++i) {
            a = i/100;
            b = i%100/10;
            c = i%10;
            if (i == a*a*a + b*b*b + c*c*c)
                System.out.println("水仙花数: " + i);
        }
    }
}
