/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

/**
 * Created on 14/01/15.
 */
public class SwitchStatements {

    public static void main(String[] args) {

    // basic
    basicSwitch();

    // one line switches
    basicOneLineSwitches();

    // order
    switchesInAnyOrder();

    switchesInAnyOrderWithFallThrough();

//        which data types are valid??? byte, char, short or int, Strings (7+)
//        not valid: boolean, long, float or double


//        in a switch block must be assignable to the type of switch expression. Meaning :
//        byte by = 10;
//        switch(by){
//            case 200 :  //some code;
//            case 300 :  //some code;
//        }
//        This will not compile because 300 cannot be assigned to 'by', which can only hold values from -128 to 127.



//        Will not compile as x must be a compile time constant
//        final int x;
//        x = 0;
//        int i =0;
//
//        switch (i){
//            case x:
//            default:
//        }

        switch(0){}

}

    private static void basicSwitch() {
        // change the value of i
        // notice the effect the break statement has
        // move or remove it to see what difference it makes
        int i = 2;

        //Every case constant expression in a switch block must be
        // assignable to the type of switch expression
        switch (i) {
            case 0: // cases including the default can be empty
            case 1:
                System.out.printf("Two");
            case 2:
                System.out.printf("Three");
            case 3:
                System.out.printf("Four");
                break;
            default:
                System.out.println("Default");
        }
    }

    private static void basicOneLineSwitches() {
        int i = 2;

        switch (i) {
            case 0:
                System.out.printf("One");
            case 1:
                System.out.printf("Two");
            case 2:
                System.out.printf("Three");
            case 3:
                System.out.printf("Four");
                break;
            default:
                System.out.println("Default");
        }
    }

    private static void switchesInAnyOrder() {

        long i = 20;

        switch ((int) i) {
            default:
                System.out.println("default");
                break;
            case 0:
                System.out.println("a");
                break;
            case 1:
                System.out.println("b");
                break;
            case 2:
                System.out.println("c");
                break;
        }
    }

    private static void switchesInAnyOrderWithFallThrough() {

        long i = 20;

        switch ((int) i) {
            default:
                System.out.println("default");
            case 0:
                System.out.println("a");
            case 1:
                System.out.println("b");
            case 2:
                System.out.println("c");
        }

        outer: if(true){
            break outer;
        }
    }
}