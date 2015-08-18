/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.inheritance;

/**
 * Created on 18/01/15.
 */
public class Animal {

    int x = 1;

    final int y = 10;

    public void eat (String food){
        System.out.println("I eat " + food);
    }

    public void sleep (int hours){
        System.out.println("I sleep for :" + hours + " hours");
    }

    public final Boolean isAnimal () {
        return true;
    }

    void someMethod(int x, String y){}

    private void privateMethod(int x, String y){}

    public Animal canISubType(){
        return this;
    }
}
