package com.company;

import com.company.Sinton;

public class Testing {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("If it displays the same values, then singleton was reused" + "\n" +
                "If it displays the different values, then two singletons were create" + "\n\n" +
                "OUTPUT:" + "\n");
        System.out.println("---------------------------------------------------------------------");
        Sinton single = Sinton.getInst("aaa");
        Sinton anothersingle = Sinton.getInst("bbb");
        System.out.println(single.val);
        System.out.println(anothersingle.val);
    }
}




