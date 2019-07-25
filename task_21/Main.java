package com.company.task_21;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        String str1="Polymer are ";
        long d1, d2;
        long start1=System.nanoTime();
        for (int i=0; i<1000; i++) {
            str1=str1+"studied in the";
        }
        long finish1=System.nanoTime();
        d1=finish1-start1;
        System.out.println(str1);
        System.out.println("d1 = "+d1);
        StringBuilder str2=new StringBuilder("Polymer are ");
        long start2=System.nanoTime();
        for (int i=0; i<1000; i++) {
            str2.append("studied in the");
        }
        long finish2=System.nanoTime();
        d2=finish2-start2;
        System.out.println(str2);
        System.out.println("d2 = "+d2);
        if (d1>d2) System.out.println("Скорость выполнения StringBuilder меньше");
        else System.out.println("Скорость выполнения String меньше");
    }
}
