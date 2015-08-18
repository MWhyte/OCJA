/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

/**
 * Created on 21/01/15.
 */
public class FinallyTest{
    public static void main(String args[]) throws Exception{
        try{
            m1();
            System.out.println("A");

//        see difference when umcommenting
//        } catch (Exception e){
//            System.out.println("caught");
        } finally{
            System.out.println("B");
        }
        System.out.println("C");
    }
    public static void m1() throws Exception { throw new Exception(); }
}