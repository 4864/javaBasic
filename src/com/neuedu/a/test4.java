package com.neuedu.a;

public class test4 {
    public static void main(String[] args) {
        int n = 0;
        for(int i = 1; i <= 4; ++i)
            for(int j = 1; j <= 4; ++j)
                for(int k = 1; k <= 4; ++k)
                    if(i != j && j != k && i != k && ++n != 0)
                        System.out.println("NO."+n+":"+i+""+j+""+k);
        System.out.println("共有:" + n + "种");
    }
}
