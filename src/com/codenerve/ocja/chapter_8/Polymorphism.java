/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_8;

/**
 * Created on 18/01/15.
 */
public class Polymorphism extends Super {

    public static void main(String [] args) {

        // all classes extend Object by default
        Object x = new Integer(10);

        // if assigned to Object it can only perform Object's methods such as
        System.out.println(x.equals(10));
        // and NOT any of Integer's methods such as
        // x.intValue();

        // Polymorphism with exceptions
        Super sup = new Polymorphism();
        // here even though the method called will be the class Polymorphism's m method which does not
        // throw an exception sup.m() does not compile unless surrounded by a try catch
        // this is because it is assigned to Super. At compile time it does not check which method runs
        // at runtime it will use Polymorphism's m method and this catch will never occur
        try {
            sup.m();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // this is because
    }

    @Override
    protected void m(){
        // overridden m decides to handle any exception
        // and has no throws clause
        System.out.println("Polymorphism's m method");
    }
}

class Super{
    protected void m() throws Exception{
        System.out.println("Supers m method");
    }
}