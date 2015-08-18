/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

/**
 * Created on 13/01/15.
 */
public class CallingUserDefinedException {
    public static void main(String[] args) throws UserDefinedException {

        callingWithTryCatch();

        // n.b the throws UserDefinedException must be added to the main method signature
        usingThrows();

        //OR it must be dealt with with a try catch here
        try {
            usingThrows();
        } catch (UserDefinedException e){
            System.out.println("Handle exception somehow");
        }
    }

    private static void callingWithTryCatch() {
        try {
            throw new UserDefinedException();
        } catch (UserDefinedException e) {
            System.out.println("My user defined exception" + e);
        }
    }

    private static void usingThrows() throws UserDefinedException {
        throw new UserDefinedException();
    }
}