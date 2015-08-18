/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.interfaces;

/**
 * Created on 18/01/15.
 */

// you can extend other interface but NOT implement them
// if we were to extend the List interface all classes implementing
// IPhone would have to override its declared methods also
public interface IPhone { //extends List {

    // fields can be declared if they are public or default
    public long aNumber = 12345678;
    long pinCode = 1111;

    //TODO what abt static and finals
    //TODO what abt variable in sub class with same name

    // private and protected fields are not allowed
    // private long pinCode = 1111;
    // protected long pinCode = 1111;

    public void dialNumber(int number);
    public Boolean isCallInProgress();

    // package private or default methods are allowed but shouldn't be used
    Boolean isCallInProgress3();

    // you cannot declare methods private or protected in an interface
    //private void switchCallingMode();
    //protected Boolean isCallInProgress2();

    // you cannot have a method body with implemented code like an abstract or standard class
    //public void switchCallingMode(){
    //    //do something
    //}

    // cannot have final method declarations
    //final void go();
}
