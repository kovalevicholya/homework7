package com.company.task_19;

public class Main {

    public static void main(String[] args) {
        String str = "   Polymers  are studied in   the  fields of   biophysics and macromolecular science   ";
        System.out.println("1 " + str);
        String str1 = str.trim();
        System.out.println("2"  + str1);

        int number=1;

        char char1 = ' ';
        for (int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) == char1&&str1.charAt(i+1)!=char1) {
                    number++;
            }
        }
        System.out.println("Количество слов = " + number);
    }
}
