package com.company.task_20;

public class Main {

    public static void main(String[] args) {
        String str = "Polymers are studied in the fields of biophysics and macromolecular science";
        System.out.println("1 " + str);
        int number=1;

        char char1 = ' ';
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == char1&&str.charAt(i+1)!=char1) {
                System.out.print(str.charAt(i-1));
                number++;
            }
        }
    }
}

