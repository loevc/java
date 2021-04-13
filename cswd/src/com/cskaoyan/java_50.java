package com.cskaoyan;

public class java_50 {
    public static void main(String[] args){
        for(float i=1;i<Integer.MAX_VALUE;++i){
            float a = i;
            if((a-1)%5==0){
                float b = (a-1)/5*4;
                if((b-1)%5==0){
                    float c = (b-1)/5*4;
                    if((c-1)%5==0){
                        float d = (c-1)/5*4;
                        if((d-1)%5==0){
                            float e = (d-1)/5*4;
                            if((e-1)%5==0){
                                System.out.println((int)a);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
