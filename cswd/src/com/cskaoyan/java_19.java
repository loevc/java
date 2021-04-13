package com.cskaoyan;

public class java_19 {
    public static void main(String[] args){
//        for(int i=1;i<=4;++i)
//            for(int j=1;j<=4&&j!=i;++j)
//                for(int k=1;k<=4&&k!=j&&k!=i;++k)
//                    System.out.println(i*100+j*10+k);
        for(int i=1;i<=4;++i)
            for(int j=1;j<=4;++j)
                if(i!=j)
                    for(int k=1;k<=4;++k)
                        if(k!=i&&k!=j)
                            System.out.println(i*100+j*10+k);
    }
}
