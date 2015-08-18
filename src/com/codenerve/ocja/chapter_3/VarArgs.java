/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_3;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 20/01/15.
 */
public class VarArgs {

    public static void main(String [] args) {


        // can take any number of args
        basicVarArgExample("A","B");
        basicVarArgExample("A");
        basicVarArgExample();

        // can take arrays
        String[] strings = {"A","B","C"};
        basicVarArgExample(strings);

//        Wont accept Lists
//        List<String> string2 = new ArrayList<>(3);
//        string2.add("A");
//        string2.add("B");
//        string2.add("C");
//        basicVarArgExample(string2);

        multipleArgs(5, strings);
    }

    // var args must be last or the method would not know how many params to put in strings and move one to i
    // has to be in this order
    private static void multipleArgs(int i, String... strings) {
        System.out.println(i);
        for (String s : strings)
            System.out.println(s);
    }

//    Cant have a varArg at the start of a signature of params
//    private static void multipleVarArgParams(String... x, int y) {};

    private static void basicVarArgExample(String ... x) {
        for (String s: x)
            System.out.println(s);
    }
}