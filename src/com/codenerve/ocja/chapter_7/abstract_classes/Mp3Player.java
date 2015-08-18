/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_7.abstract_classes;

/**
 * Created on 18/01/15.
 */

// once an Abstract class is marked (extends) as the super class all
// abstract methods of the super class must be implemented (unless this is another abstract class)
public class Mp3Player extends AbstractMusicPlayer {


    // must override and implement the abstract method in AbstractMusicPlayer
    @Override
    public void play() {
        System.out.println("play mp3");
    }

    // must override and implement the abstract method in AbstractMusicPlayer
    @Override
    public void stop() {
        System.out.println("stop mp3");
    }

    // Note that we do not have to implement the changeVolume method
    // since it is not an abstract method. We can however override it
    @Override
    public void changeVolume(int newVolume){
        System.out.println("Change mp3 volume");

        // can access public fields from abstract parent. But not private
        int pubVolume1 = pubVolume;
    }

    public static void main(String [] args) {

        AbstractMusicPlayer amp = new Mp3Player();
    }
}