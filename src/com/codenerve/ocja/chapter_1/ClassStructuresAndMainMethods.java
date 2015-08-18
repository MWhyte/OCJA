/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_1;

/**
 * Created on 19/01/15.
 */
public class ClassStructuresAndMainMethods {

    // final is optional
    // order final public void main(String [] args) { is valid
    public final static void main(String [] args) {

    }

    // ... to declare and array is valid
    //public static void main(String... args) {
    //
    //}

    // or other array syntax's
    //public static void main(String  args[]) {
    //
    //}
    //public static void main(String  []args) {
    //
    //}
}

// Cannot have two public classes in the same file
/*public*/ class OtherClass{

}

// cannot have private either since nothing could access it
/*private*/ class AnotherClass{

}

// can have multiple other classes

