/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

/**
 * Created on 21/01/15.
 */
public class PropagatingUnCheckedEx {

    static String s = "";

    public static void main(String args[]) {

        // completely optional try catch
        // could call m() by itself however try catching allows
        // the program to continue and print s
        try {
            m();
        } catch (Exception e) {
        }
        System.out.println(s);
    }

    public static void m() {
        m0(1, 2);
        m1(3);
    }

    public static void m0(int a, int b) {
        s += a;
        m2();
        m1(b);
    }

    public static void m1(int i) {
        s += i;
    }

    // no need for method signature in m2 or
    // any method above it in the stack
    public static void m2() {
        // throws an unchecked exception
        throw new NullPointerException("aa");
    }
}