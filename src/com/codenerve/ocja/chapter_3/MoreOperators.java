/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_3;

/**
 * Created on 19/01/15.
 */
public class MoreOperators {


    public static void main(String [] args) {
        ternaryOperators();
    }

    public static void ternaryOperators() {

        int x = 0;
        boolean bool;

        // simple ternary
        bool = x >0 ? true: false;
        System.out.println(bool);

        // nested ternary
        bool = x >0 ? x<0? true: false : false;
        // easier to read with brackets but optional
        bool = x >0 ? (x<0? true: false) : false;
        // nested nested ternary. ok that's enough!
        bool = x >0 ? (x<0? (x==0?true: false): false) : false;
        bool = x >0 ? x<0? x==0?true: false: false : false;

    }
}
