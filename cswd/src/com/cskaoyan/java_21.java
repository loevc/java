package com.cskaoyan;

public class java_21 {
    public static void main(String[] args){
        for(int i=1;i<100000;++i){
            if (Math.sqrt(i+100)==(int)Math.sqrt(i+100))
                if(Math.sqrt(i+100+268)==(int)Math.sqrt(i+100+268))
                    System.out.println(i);
        }
        System.out.println(Math.sqrt(4256+100+268));
    }
}
