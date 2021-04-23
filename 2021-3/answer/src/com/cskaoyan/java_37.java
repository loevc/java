package com.cskaoyan;

public class java_37 {
    public static void main(String[] args){
        int account = 20;
        int bottle = 0;
        while(account >= 3){
            account -= 3;
            bottle++;
            account++;
        }
        System.out.println(bottle);
    }
}
