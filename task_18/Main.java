package com.company.task_18;

public class Main {

    public static void main(String[] args) {
	String str = " Polymers, are studied! in the fields. of biophysics? and macromolecular! science   ";
        System.out.println("1 " + str);
	str.trim();
	    System.out.println("2"  + str);
        char symbol;
        int number=0;

        char[] char1 = {'.', ',', '!', '?', ':', ';', '/', '"', '-', '(', ')'};
        for (int j = 0; j < str.length(); j++) {
            for (int i = 0; i < char1.length; i++) {
                symbol = str.charAt(j);
                if(symbol == char1[i]) {
                    number++;
                }
            }
        }
        System.out.println("Общее количество знаков препинания = " + number);
    }
}
