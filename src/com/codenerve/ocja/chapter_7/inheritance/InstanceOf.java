/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.inheritance;

/**
 * Created on 20/01/15.
 */
interface Flyer{ }
class Bird implements Flyer { }
class Eagle extends Bird { }
class Bat { }

public class InstanceOf {

    // be aware that instanceof is a valid java operator

    public static void main(String[] args) {
        Bird bird = new Bird();
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();

        if(f instanceof Flyer) System.out.println("f is a Flyer");
        if(e instanceof Bird) System.out.println("e is a Bird");


        // returns false as Eagle is a more specific object (a sub class)
        // than bird.A bird can be other things to false is returned
        if(bird instanceof Eagle) {
            System.out.println("bird is an Eagle");
        }
        else {
            System.out.println("bird is not an Eagle");
        }

        // wont compile as the compiler know it is impossible
        // to assign a Bird or any subclass to a bat
        // b must be a sub/super class of Bird OR implement Bird (if in fact Bird was an interface)
        //if(b instanceof Bird) System.out.println("f is a Bird");

        // doesn't check whether bat implements Flyer at compile time
        // this will work and return false
        if(b instanceof Flyer)
            System.out.println("bat is a flyer");
        else
            System.out.println("bat is not a flyer");

    }
}

class Test{

    public static void m2() {
        throw new NullPointerException("aa");
    }

    public static void main(String[] args){

        System.out.println("0123456789".substring(4,9));

        System.out.println("Hello".substring(0));


        int x =0;

        do{ x = 3; } while(false);
        if (false) { x=3; }
//        while (false) { x=3; }
        for( int i = 0; i< 0; i++) x = 3;

        m2();
    }
}