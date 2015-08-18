/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

import java.io.IOException;

/**
 * Created on 13/01/15.
 */
public class PropagatingCheckedEx {

    public static void main(String[] args) {

        // notice the call stack method 4 throws to 3 which in turn throws to 2
        // which in turn throws to 1 which in turn throws to main where it is eventually handled
        try {
            method1();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("%%%%%%%"+0 % 10);

        m2();

        boolean b1 = false;
        boolean b2 = false;
        if (b2 = b1 == false){
            System.out.println("true");
        } else{ System.out.println("false");
        }


    }

    // unchecked exception doesnt require throws signature
    private static void m2() {
        throw new NullPointerException("aa");
    }

    private static void method1() throws IOException {
        method2();
    }
    private static void method2() throws IOException {
        method3();
    }


    private static void method3() throws IOException {
        method4();
    }

    private static void method4() throws IOException {
        // checked exception
        throw new IOException();
    }



}
