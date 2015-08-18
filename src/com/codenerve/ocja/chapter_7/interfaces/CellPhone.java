/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.interfaces;

/**
 * Created on 18/01/15.
 */                                         // Multiple interfaces can be implemented
public class CellPhone implements IPhone {   // , SomeOtherInterface {

    // like inheritance methods are marked with the override annotation
    // optionally
    public void dialNumber(int number) {
        // public fields of an interface can be used
        System.out.println("dialling" + aNumber);
        // as can default scope
        long code = pinCode;


        // interface variable can be accessed as if static
        // which it is not.
        long bb = IPhone.aNumber;

        // interface variables are implicitly final and cannot be changed
        //aNumber = 100;

        // interface variables are static and final by default

        // this is because interfaces cannot be instantiated in there own right
    }

    @Override
    public Boolean isCallInProgress() {
        //TODO: Write Code
        return false;
    }

    @Override
    public Boolean isCallInProgress3() {
        return null;
    }
}
