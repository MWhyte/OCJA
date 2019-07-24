/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_1;

/**
 * Created on 21/01/15.
 */
public class Blocks {

    // Order of Creation
    // static, then instance, then constructor
    public static void main(String [] args) {


        // class first referenced causes static block to execute
        System.out.println(AClass.x);

        AClass aClass = new AClass();
        AClass aClass2 = new AClass();
        AClass aClass3 = new AClass();
        AClass aClass4 = new AClass();
    }
}

class AClass{

    static int x;
    static int y;

    // static only ever runs once regardless of how many instances are created
    // this will happen the first time AClass is referenced or instantiated
    // i.e on AClass.a or new AClass
    static {
        x++;
        System.out.println("inside static block x=" + x);
    }

    // instance block. Runs every time an instance is created. this is useful if you have multiple constructors
    // but want to ensure that some block of code is executed every time you instantiate the class
    // regardless of which constructor is used
    {
        y++;
        System.out.println("inside instance block x= " + x +" y=" + y);
    }

    public AClass() {
        System.out.println("inside constructor x= " + x +" y=" + y);
    }
}
