/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_3;

/**
 * Created on 19/01/15.
 */
public class Strings { //extends String { String SBuff and Sbuilder are final

    public static void main(String [] args) {


        // String concatenation
        // any arg after a string added using the + operator is used to
        // concatenate the rest of the args as strings
        System.out.println("1" + 2 + 3);        // 123
        // any other order will cause args to be treated like ints
        System.out.println(1 + 2 + "3");        // 33
        //
        System.out.println(1 + 2 + "3" + 4 + 5);// 3345





    }
}
