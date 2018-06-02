package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int - 32 (4 bytes)
        int myInt = 5 / 2;

        // width of float - 32 (4 bytes)
        float myFloat = 5.3f;

        // width of double - 64 (8 bytes)
        double myDouble = 5.3;

        System.out.println("myInt = " + myInt);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
    }
}
