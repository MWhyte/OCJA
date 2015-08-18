/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_6;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created on 05/01/15.
 */
public class OneDimensionalArrays {



    // Pros of ArrayList over arrays[]
    // Automatically re-sizes
    // can place elements in the middle of arrays
    // elements can be moved and other elements will re adjust

    // cons
    // cannot store primitives without being in wrapper classes
    // extra overhead required when resizing
    // must nest ArrayLists in an ArrayList to achieve multi dimensions

    public static void main(String[] args) {

        createUpdateAndRead();
        waysToDeclareArrays();
        waysToInitializeArrays();
        operationsOnArrays();

        arrayLists();

        try {
            throw new CloneNotSupportedException();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    private static void createUpdateAndRead() {

        int [] arrayOfZeroLength = new int[0];


        int [] arrayOfInts = new int[3];

        arrayOfInts[0] = 1;
        arrayOfInts[1] = 2;
        arrayOfInts[2] = 3;

        System.out.println("First: " + arrayOfInts[0] + " Second: " + arrayOfInts[1] + " Third: " + arrayOfInts[2]);
    }

    private static void waysToDeclareArrays() {
        String[] stringArray;
        // or another equivalent way
        String stringArray2[];

        // this is basically the same as the first array
        // just the whitespace making it look different
        String []strindgArra3;
        String strindgArra4;
    }

    private static void waysToInitializeArrays() {
        String[] stringArray = new String[3];
        //or
        String[] stringArray2 = {"A","B","C"};

        int stringArray3[] = new int[] {0,1,2};

        // can be re-assigned
        stringArray = new String[2];

        // re assigning this was it NOT allowed
        //stringArray2 = {"1","2","3"};

        // must have a size. This is not valid
        //stringArray2 = new String[];
    }

    private static void operationsOnArrays() {

        String[] stringArray = new String[3];
        stringArray[0] = "0";
        stringArray[1] = "1";
        stringArray[2] = "2";
        // finding the length of an array
        System.out.println("Length = " + stringArray.length);

        // N.B it does not matter if each element in the array is not given a value yet
        String[] stringArray2 = {"A","B","C"};
        System.out.println("Second Array length = " + stringArray2.length);

        //array copy
        //first lets set some values
        stringArray[0] = "1";
        stringArray[1] = "2";
        stringArray[2] = "3";

        // src array, src pos, dest array, dest pos, length

        // this would completely copy over the dest stringArray with
        // the contents of stringArray2
        // System.arraycopy(stringArray2, 0, stringArray,0,3);

        // this partially copies over string array and give a result
        // of B,C,3
        System.arraycopy(stringArray2, 1, stringArray,0,2);
        //TODO pay around with these more.

        // iterate and print source array with enhanced for loop
        for (String x : stringArray){
            System.out.println(x + " ");
        }

        // or with the standard for loop
        for(int i = 0; i < stringArray.length; i++){
            System.out.println(stringArray[i] + " ");
        }

        // stringArray2 after copy was done you can see it remains unchanged
        for (String x : stringArray2){
            System.out.println(x + " ");
        }
    }

    private static void arrayLists() {
        ArrayList arrayList = new ArrayList<String>();
        arrayList = new ArrayList<String>(10);
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");

        //arrayList.trimToSize(3); not valid as it is no arg method
        //trims the arrayList to the current size of the array
        arrayList.trimToSize();

        // get the size of the ArrayList not .length
        System.out.println(arrayList.size());

        // method to increase the array size at a later time
        arrayList.ensureCapacity(10);
        // note not 10 size is based on actual elements in the array not its capacity
        System.out.println(arrayList.size());

        System.out.println(arrayList);


        ArrayList arrayList1 = new ArrayList();
        int x = 0;
        arrayList1.add(x);


        //
        Collections.sort(arrayList);
    }
}