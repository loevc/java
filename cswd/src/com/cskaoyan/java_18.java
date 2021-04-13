package com.cskaoyan;

public class java_18 {
    public static void main(String[] args){
        for(int i=6;i<1001;++i){
            int sum=0;
            for(int j=1;j<i;++j){
                if(i%j==0)
                    sum+=j;
            }
            if (sum==i)
                System.out.println(i);
        }
    }
}
