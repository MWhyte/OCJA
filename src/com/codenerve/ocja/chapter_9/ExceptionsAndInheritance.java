/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

/**
 * Created on 21/01/15.
 */
public class ExceptionsAndInheritance extends SuperClass {

    public static void main(String [] args) {

        SuperClass superClass = new ExceptionsAndInheritance();
        try {
            superClass.connect("127.0.0.1");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }
    }

    // sub classes overridden method can throw are more specific exception
    // than that of its super class
    // you CANNOT throw a broader exception in the overridden method than that of the parent
    @Override
    long connect(String ip) throws IllegalAccessException {
        // some logic to connect to a server
        return 0;
    }
}

class SuperClass {

    long connect(String ip) throws Exception {
        // some logic to connect to a server
        return 0;
    }


}
