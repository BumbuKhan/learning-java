package com.company;

public class Main {

    public static void main(String[] args) {
        // int has a width of 32
        int minInt = -2_147_483_648;
        int maxInt = 2147483647;

        int myNewInt = (minInt / 2);
        System.out.println("My total = " + myNewInt);

        // byte has a width of 8
        byte minByte = -128;
        byte maxByte = 127;

        byte myNewByte = (byte)(maxByte / 4);
        System.out.println("Another total = " + myNewByte);

        // short has a width of 16
        short myMinShortik = -32768;
        short myMaxShortik = 32767;

        // long has a width of 64
        long myLong = 100L; // can hol veeeeeeeeery huge number!
    }
}
