package com.cskaoyan;

public class java_44 {
    public static void main(String[] args){
        for(char i='x';i<='z';++i)
            for(char j='x';j<='z';++j)
                if(i!=j)
                    for(char k='x';k<='z';++k)
                        if(k!=i&&k!=j)
                            if(i!='x'&&k!='x'&&k!='z'){
                                System.out.println("a-->" + i);
                                System.out.println("b-->" + j);
                                System.out.println("c-->" + k);
                            }
    }
}
