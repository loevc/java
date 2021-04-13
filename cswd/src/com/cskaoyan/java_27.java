package com.cskaoyan;

public class java_27 {
    public static void main(String[] args){
        for(int i=2;i<101;++i){
            boolean flag = true;
            for(int j=2;j<i;++j){
                if(i%j==0)
                    flag = false;
            }
            if(flag)
                System.out.println(i);
        }
    }
}
