/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_1;

/**
 * Created on 22/01/15.
 */
public class CrazyBlocks {
    public static void main(String [] args) {
        Manager m = new Manager();

        // Employee static 10 Manager static  Employee 15 Manager 30

        // which is
        // 1. Base class static (rem static only ever runs once)
        // 2. class static (runs once)
        // 3. base class instance block
        // 4. class instance block
        // 5. class constructor
    }
}

class Employee {

    static int i = 10;  {
        i = 15;
        System.out.print(" Employee "+i);
    }
    static { System.out.print(" Employee static "+i); }
}

class Manager extends Employee {
    static {
        i = 45;
        System.out.print(" Manager static ");
    }{
        i = 30;
        System.out.print(" Manager "+i);
    }
}

class Owner extends Manager{
    static { System.out.println("Owner"); }
}
