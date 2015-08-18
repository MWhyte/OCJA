/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_6;

/**
 * Created on 15/01/15.
 */
public class MultiDimensionalArrays {

    public static void main(String [] args) {
        waysToCreate();
        updating();
        iterating2DArrays();
    }

    private static void waysToCreate() {
        // ways to declare similar to one d arrays but with two or more [][]

        // declaring
        char[][] x;
        char y[][];
        char [][]z;
        int[] array2D[] = new int [2] [2];

        // initialising
        x = new char[2][2];

        // can access one of the arrays in a 2d array and assign it to a one d array
        char[] a = x[0];

        // you can initialise only the first dimension of a multi dimensional array
        // no other combinations are valid
        // and the second dimension will be null
        y = new char[2][];

        // assigning
        // y[1][0]=1;
        // will result in a NPE

        // we can however instantiate the second dimension later
        y[1] = new char[2];
        // and then assign a value to the second dimension without an exception
        y[1][0]=1;

        // way to declare and assign values in one line
        char[][] xx = {{1,2},{3,4}};
        char yy[][] = {{1,2},{3,4}};
        char[] zz[] = {{1,2},{3,4}};

        // an array can have up to 256 dimensions!!!! This is specified by the JVM
        char [][][][][][][][][][][][][][][][][][][][][][][][][] holyShit;

        //invalid ways to initialise
        // invalid as no size specified in the first or both dimensions
        //y = new char[][];
        // invalid as z is not an array
        //char z = {{1,2},{3,4}};
    }

    private static void updating() {
        char[][] x = new char[2][2];
        x[0][0]= 1;
        x[0][1]= 2;
        x[1][0]= 3;
        x[1][1]= 4;

        // re-assigning the second array to an empty array of size 3
        // remember 2d arrays do not have to be rectangular or square
        x[1]= new char[3];

        // only prints arrays reference
        System.out.println(x);
        System.out.println(x.toString());

        // access element
        System.out.println(x[1][0]);

        // compiles but prints only the reference to the second array in the 2d array
        System.out.println(x[1]);
    }

    private static void iterating2DArrays() {

        Integer zz[][] = {{1,2},{3,4},{5,6},{7,8,9}};

        for (int i = 0; i < 4; i++) {
            System.out.println(zz[i][0] + "x");
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(zz[0][i] + "y");
        }

        // nested loops for accessing all elements of both dimensions
        for (int x = 0; x < zz.length; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.println(zz[x][y] + " both x and y");
            }
        }
        // nested loops for accessing all elements of both dimensions
        // labels can also be used to describe the purpose of each loop
        outer: for (int x = 0; x < zz.length; x++) {
            inner: for (int y = 0; y < 2; y++) {
                System.out.println(zz[x][y] + " both x and y");
            }
        }
        // 9 is never printed out in these loops because we never access it. trying to would
        // cause index out of bounds exception in the other arrays which do not have a
        // third [3] element not all 2d arrays are rectangular

        //.length only maps one dimension of 2d array
        System.out.println(zz.length);
        //unless you specify which 1d array to call length on
        System.out.println(zz[0].length);
        System.out.println(zz[3].length);

        // accessing an invalid location causes @ArrayIndexOutOfBoundsException
        //System.out.println(zz[4].length);

    }
}