/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 14/01/15.
 */
public class Operators {


    public static void main(String[] args) {

        System.out.println("Under scores");
        int x = 1____3_4;
        System.out.println("x = " + x);

        System.out.println("arithmeticOperators");
        arithmeticOperators();

        System.out.println("relationalOperators");
        relationalOperators();

        System.out.println("bitwiseOperators");
        bitwiseOperators();

        System.out.println("logicalOperators");
        logicalOperators();

        System.out.println("assignmentOperators");
        assignmentOperators();

        System.out.println("Ternary or conditional operator");
        conditionalOperator();

        System.out.println("instanceof operator");
        instanceofOperator();

        incrementDecrementWithBitWiseVsShortCircuitingOperators();

        System.out.println("a".concat("b"));

    }

    private static void arithmeticOperators() {
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;

        System.out.println("a + b = " + (a + b) );
        System.out.println("a - b = " + (a - b) );
        System.out.println("a * b = " + (a * b) );
        System.out.println("b / a = " + (b / a) );
        System.out.println("b % a = " + (b % a) );
        System.out.println("c % a = " + (c % a) );
        System.out.println("a++   = " +  (a++) );
        System.out.println("a--   = " +  (a--) );

        // Check the difference in d++ and ++d
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        System.out.println(" ");

        List x = new ArrayList();
        x.add("a");
        x.add(1);
        x.add(new Integer(1));
        x.add(2, new Integer(1));
        x.set(2, new Integer(1));
    }

    private static void relationalOperators() {
        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b) );
        System.out.println("a != b = " + (a != b) );
        System.out.println("a > b = " + (a > b) );
        System.out.println("a < b = " + (a < b) );
        System.out.println("b >= a = " + (b >= a) );
        System.out.println("b <= a = " + (b <= a) );

        System.out.println("and booleans....");

        boolean x = true;
        boolean y = false;
        System.out.println("x =" + x + " y =" + y);
        System.out.println("x == y = " + (x == y) );
        System.out.println("x != y = " + (x != y) );
//        System.out.println("x > y = " + (x > y) );
//        System.out.println("x < y = " + (x < y) );
//        System.out.println("y >= x = " + (b >= y) );
//        System.out.println("y <= x = " + (b <= y) );

        System.out.println("");
    }

    private static void bitwiseOperators() {

        int a = 60;	/* 60 = 0011 1100 */
        int b = 13;	/* 13 = 0000 1101 */
        int c = 0;

        // &
        c = a & b;       /* 12 = 0000 1100 */
        System.out.println("a & b = " + c );

        // |
        c = a | b;       /* 61 = 0011 1101 */
        System.out.println("a | b = " + c );

        // ^
        c = a ^ b;       /* 49 = 0011 0001 */
        System.out.println("a ^ b = " + c );

        //~
        c = ~a;          /*-61 = 1100 0011 */
        System.out.println("~a = " + c );

        // <<
        c = a << 2;     /* 240 = 1111 0000 */
        System.out.println("a << 2 = " + c );

        // >>
        c = a >> 2;     /* 215 = 1111 */
        System.out.println("a >> 2  = " + c );

        // >>>
        c = a >>> 2;     /* 215 = 0000 1111 */
        System.out.println("a >>> 2 = " + c );

        System.out.println("");


        //TODO bitwise with boolean
    }

    private static void logicalOperators() {
        boolean a = true;
        boolean b = false;

        // short circuiting
        // wont evaluate both sides if first automatically makes it true / false
        System.out.println("a && b = " + (a && b));

        System.out.println("a && b || a = " + (a && b || a));

        System.out.println("a || b = " + (a || b) );

        System.out.println("!(a && b) = " + !(a && b));

        System.out.println("");


    }

    private static void assignmentOperators() {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ;
        System.out.println("c %= a  = " + c );

        c <<= 2 ;
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ;
        System.out.println("c >>= a = " + c );

        c &= a ;
        System.out.println("c &= 2  = " + c );

        c ^= a ;
        System.out.println("c ^= a   = " + c );

        c |= a ;
        System.out.println("c |= a   = " + c );

        System.out.println("");
    }

    private static void conditionalOperator() {
        int a , b;
        a = 10;
        b = (a == 1) ? 20: 30;
        System.out.println( "Value of b is : " +  b );

        b = (a == 10) ? 20: 30;
        System.out.println( "Value of b is : " + b );

        // only numbers work here
        // methods return void, boolean string etc do not
        //b  = (a==10) ? returnsFalse() : returnsTrue() ;

        // notice chars do they are promoted to ints
        b  = (a==10) ? 'b' : 'a' ;

        // also note Strings, booleans etc will work if the type to be assigned the
        // value is matching
        boolean bool  = (a==10) ? returnsFalse() : returnsTrue() ;

        // void will still not work
        //(a==10) ? returnVoid() : returnVoid();

        System.out.println("");
    }

    private static boolean returnsFalse() {
        return false;
    }

    private static boolean returnsTrue() {
        return true;
    }

    private static void instanceofOperator() {
        Boolean a = true;
        boolean bool = a instanceof Boolean;
        System.out.println(bool);
        System.out.println("");
    }

    private static void incrementDecrementWithBitWiseVsShortCircuitingOperators() {


        int i = 0, j = 0;

        // post increment means i=0 and j=0 so true
        // but incremented before printing
        // bitwise and & means both sides of condition are executed
        if (i++ ==0 & j-- == 0){
            System.out.println("true. i=" + i + " j=" + j);
        } else {
            System.out.println("true. i=" + i + " j=" + j);
        }

        i = 0;
        j = 0;

        // post increment means i=0 and j=0 so true
        // but incremented before printing
        // bitwise or | both sides of condition are executed
        if (i++ ==0 | j-- == 0){
            System.out.println("true. i=" + i + " j=" + j);
        } else {
            System.out.println("true. i=" + i + " j=" + j);
        }


        i = 0;
        j = 0;

        // post increment means i=0 and j=0 so true
        // but incremented before printing
        // short circuiting or || means only first side of the condition is executed
        if (i++ ==0 || j-- == 0){
            System.out.println("true. i=" + i + " j=" + j);
        } else {
            System.out.println("true. i=" + i + " j=" + j);
        }
    }
}
