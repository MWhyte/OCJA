/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.abstract_classes;

/**
 * Created on 20/01/15.
 */
// remember that the class must be abstract if one or more methods are abstract
public abstract class SonyMp3Player extends Mp3Player {

    // this is to illustrate that you can inherit implemented classes
    // in an abstract class AND override implemented methods to
    // abstract methods!!!
    @Override
    public abstract void changeVolume(int newVolume);
}
