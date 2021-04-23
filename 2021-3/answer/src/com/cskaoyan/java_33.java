package com.cskaoyan;

public class java_33 {
    public static void main(String[] args){
        int tg = 0;
        for(int i=1;i<100;++i){
            tg = i*i;
            if(i<10 && (tg%10==i))
                System.out.println("同构数是: " + i);
            else if(i<100 && (tg%100==i))
                System.out.println("同构数是: " + i);
        }
    }
}
