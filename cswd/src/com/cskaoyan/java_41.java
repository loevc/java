package com.cskaoyan;

public class java_41 {
    public static void main(String[] args){
        float sum = 100;
        float high = 100;
        for(int i=2;i<11;++i){
            high /= 2;
            sum += high*2;
        }
        System.out.println("共经过 " + sum + "米");
        System.out.println("第十次反弹" + high + "米");
    }
}
