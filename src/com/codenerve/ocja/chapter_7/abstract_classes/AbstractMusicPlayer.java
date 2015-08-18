/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.abstract_classes;

/**
 * Created on 18/01/15.
 */

// an abstract class can inherit from a super class.... extends Animal would compile
// An abstract class can extend other abstract classes also
public abstract class AbstractMusicPlayer {

    // abstract classes can have fields
    private int volume;
    public int pubVolume;

    // abstract classes can have un-implemented methods
    // an abstract class can only exist in an abstract class
    // these must be implemented in the sub class UNLESS the sub class is another abstract class
    public abstract void play();
    public abstract void stop();

    // abstract classes can have implemented methods
    public void changeVolume(int newVolume){
        volume = newVolume;
    }

    //TODO study throwing exceptions between abstract classes
}