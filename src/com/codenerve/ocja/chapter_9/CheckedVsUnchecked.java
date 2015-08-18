/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;

/**
 * Created on 13/01/15.
 */
public class CheckedVsUnchecked {

    public static void main(String[] args) {
        // may need to comment out methods and run one method at a time

        // checked
        checkedException();

        // unchecked
        unCheckedArithmeticExceptionCaughtOptionally();
        unCheckedArithmeticException();
    }

    private static void checkedException() {


        String[] array = {""};
        Object o = array;

        // FileInputStream throws FileNotFoundException
        // this is a checked exception and gets checked
        // during compile time therefore must be checked
        try {
            FileInputStream fis = new FileInputStream("B:/myfile.txt");
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        // IOException is also checked. Thrown by the read method fis.read()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void unCheckedArithmeticException() {
        int x = 10;
        int y = 0;
        int z;

        z = x / y;

        System.out.println("This will not print since an exception has occurred " + x);
    }

    private static void unCheckedArithmeticExceptionCaughtOptionally() {
        int x = 10;
        int y = 0;
        int z;

        try{
            z = x / y;
        } catch (ArithmeticException e){
            System.out.println("optionally catching and unchecked exception" + e);
        } finally {
            System.out.println(x);
        }
        System.out.println("This will still print even if there is a finally clause");
    }
}
