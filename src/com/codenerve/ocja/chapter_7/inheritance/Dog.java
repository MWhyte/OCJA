/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.inheritance;

/**
 * Created on 18/01/15.
 */
public class Dog extends Animal {

    // super fields can be replaced in the sub class regardless of scope
    // these are specific fields for Dog. This is not overriding
    //private int x;
    //public int x;
    protected  int x = 10;

    // shadow final exists in parent
    protected int y = 0;

    // constructors
    // if no constructor is declared in the child object a default one is provided like:
    // public Dog() {
    //    super();
    // }
    // this can cause issue's if the super class has a constructor with args since it may not then have
    // a no args constructor to call super() on. This would not compile

    // conversely calling super with args on a super class that has not matching constructor
    // will also not compile
    // public Dog(int x) {
    //    super(x);
    // }

    public void bark (){

        System.out.println("Woof!");
    }

    // cant create two methods with the same name, return type and args and one is static
    //public static void bark (){
    //    System.out.println("Woof!");
    //}


    // in order to override a method from the parent class the method signature
    // including return type and input parameters must be identical
    @Override // optional override annotation
    public void sleep(int mins){
        System.out.println("I sleep for " + mins + " minutes");
    }

    // all classes in java are subclasses of Object
    // of which toString is one method we can override
    @Override
    public String toString() {
        return "I am a Dog";
    }

    // methods marked final cannot be overridden
    // classes marked final can not be extend (used for inheritance)
    //@Override
    //public final Boolean isAnimal () {
    //    return true;
    //}

    // cant reduce the scope of a super classes methods signature
    //private void someMethod(int x, String y){
    //
    //}

    // but you can increase the scope
    @Override
    public void someMethod(int x, String y){
    }

    // a return type can be specified as the super class
    // even when returning the sub class
    // if this method was static 'this' would not compile
    // also static methods cannot be overridden
    public Animal getMe(){
        return this;
    }

//    private methods cannot be overridden
//    @Override
//    private void privateMethod(int x, String y){}

//    you can also override default methods
//    @Override
//    void someMethod(int x, String y){
//
//    }

    // overridden methods can return subtypes
    // original returned Animal
    @Override
    public Dog canISubType(){
        return this;
    }
}