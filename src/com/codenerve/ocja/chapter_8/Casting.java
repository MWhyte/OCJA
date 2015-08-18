/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_8;

/**
 * Created on 21/01/15.
 */
public class Casting {

    public static void main(String [] args) {

        castingPrimitives();
        castingObjects();
        wrapperClasses();
    }

    private static void castingPrimitives() {


        boolean b = true;    // 1-bit
        char c = 1;          // 16-bits
        byte by = 1;         // 8-bits
        short s = 1;         // 16-bits
        int i = 1;           // 32-bits
        long l = 0;          // 64-bits
        float f = 1f;        // 32-bits floating point so larger range than int and long
        double d = 1D;       // 64-bits floating point so larger range than float, long and int

        // incompatible types
        //b = c;


        // ***** Smaller type's to larger. No cast required
        s = by; // byte assigned to short
        i=s;    // short assigned to int
        l = i;  // int assigned to long
        f = l;  // long assigned to float
        d = f;  // float assigned to double

        // short and chars need cast in both directions
        // same size of 16-bits but char is unicode and short is signed integer
        // potential and likely precision loss in both directions
        s = (short) c;
        c = (char) s;

        // ***** Larger type's to smaller. Cast required
        // required as precision could be lost
        f = (float) d;
        l = (long) f;
        // etc etc
        // left most bits in a cast are truncated resulting in precision loss
    }

    private static void castingObjects() {
        Animal a = new Dog();
        Mammal m = (Mammal) a;
        Dog d = (Dog) m;

        // no cast as this is polymorphism
        // sub type assigned to super type
        Object o = d;

        // casting back to original object
        d = (Dog) a;

        // casting to super type is allowed
        // actual object is dog, currently assigned to Animal
        a = d;
        // and casting to class in the middle of the two in the inheritence tree works
        m = (Mammal) a;

        // more safely used with instance of
        if (a instanceof Dog){
            // cast still required to inform compiler
            d = (Dog) a;
        }

        // original object must have been the object you are casting to at one point
        // or a super class of the original
        //Cat c = d; WILL NOT EVEN4 COMPILE


        //casting to an invalid type like a sub class of the original object
        // will cause a class cast exception
        try {
            BigDog bd = (BigDog) a;

        // a ClassCastException is a runtime exception and does not have to be caught
        } catch (ClassCastException s){
            System.out.println("ClassCastException");
        }
    }

    private static void wrapperClasses() {
        int i = 8;
        //creating an integer obj from constructor that uses int as an input arg
        // only option pre java 5.0
        Integer obj1 = new Integer(i)
                ;
        // explicit casting
        Integer obj2 = (Integer)i;
        // auto boxing
        Integer obj3 = i;

        // auto unboxing
        i = obj1;

        float f = 5.7f;
        Float fObj = f;
    }
}

class Animal{}
class Mammal extends Animal{}
class Dog extends Mammal{}
class BigDog extends Dog {}
class Cat {}