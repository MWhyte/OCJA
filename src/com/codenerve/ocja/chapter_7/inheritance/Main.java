/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.inheritance;

/**
 * Created on 18/01/15.
 */
public class Main {

    public static void main(String [] args) {
        basicInheritance();
        abstractClasses();

    }

    private static void basicInheritance() {
        // with polymorphism
        Animal animal = new Dog();
        animal.eat("doggy biscuits");

        // returns Animals variable x value not dogs x value
        // i.e. fields are not overriding
        System.out.println("Animals x=" + animal.x);

        // cant access variable y as this is specific to Dog and the Dog instance was assigned to Animal
        // animal.y = 10;

        // note if your using the parent class then you cant
        // access the sub classes unique methods
        //animal.bark(); // will not compile

        // on the other hand even when using the super class the jvm will override
        // the sleep method with the sub classes. so this will print the 'minutes'
        // implementation in dog not the 'hour' code in Animal
        animal.sleep(5);

        // the getClass() method of class Object always returns the actual object
        // not the assigned Type.
        System.out.println(animal.getClass());

        System.out.println("==========================");

        // without polymorphism
        Dog dog = new Dog();
        dog.eat("doggy biscuits");
        dog.bark();
        dog.sleep(5);
        System.out.println("Dogs x=" + dog.x);


        // this will cause a class cast exception
        Dog d = (Dog)new Animal();
        d.bark();
    }

    private static void abstractClasses() {

        // you cannot instantiate an abstract class regardless of whether you are trying polymorphism
        //Animal animal = new AnAbstractClass();
        //AnAbstractClass animal = new AnAbstractClass();
    }
}