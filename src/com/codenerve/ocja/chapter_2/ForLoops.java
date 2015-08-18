/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

/**
 * Created on 19/01/15.
 */
public class ForLoops {

    public static void main(String [] args) {

        multiVarForLoop();

        loopingA2dArray();

        // third arg can take code
        for(int i=0; i<10; System.out.println(++i));


        String[] array = {"A","B","C"};
        // final is the only modifier that is allowed here.
        for (final String x : array){
            // stops x being assigned inside the loop
            //x = "B";

            System.out.println(x);
        }

        invalidLoops();
    }

    private static void multiVarForLoop() {

        // multi var creation and multi increment/decrement
        for (int i=0, j=10; i<j; i++, --j) {

        }

        // no increment
        for (int i=0, j=10; i<j;) {
            // without i increment this would be an infinite loop!
            i++;
        }

        // no increment + no condition!
        for (int i=0, j=10; ;) {
            // infinite loop without below lines
            i++;
            if (i==5) break;
        }

        // no vars initialised + no condition + no increment!
        // infinite loop
//        for (;;) {
//              nothing can be done atm to stop this being infinite
//        }
    }

    private static void loopingA2dArray() {

        String[][] twoD = {{"a", "b"}, {"c", "d"}};

        outer:
        for (String[] b : twoD)
            inner:for (String x : b) {
                if (x.contains("a")) break inner; // same as just break //outer also valid here
                System.out.print(x);
            }
    }

    private static void invalidLoops() {
        // Cannot use an existing/predefined variable in the variable declaration part
        //for(ia :o){ }
    }
}