package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "Lorem ipsum dolor";
        String anotherString = myString + " hehehey";

        System.out.println(anotherString + " \u00A9 2018");

        int num = 10;
        String str = "20";

        /*str = str + num;

        System.out.println(str);*/

        double myDouble = 12.34;

        System.out.println(str + myDouble);
    }
}
