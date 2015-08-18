/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

/**
 * Created on 21/01/15.
 */
public class LoopCombos {

    public static void main(String [] args) {

        example1_whileInFor();
    }

    private static void example1_whileInFor() {
        int c = 0;
        boolean flag = true;
        for(int i = 0; i < 3; i++){
            while(flag){
                c++;
                if(i>c || c>5) flag = false;
            }
        }
        System.out.println(c);

        // tricky until you break it out. During the first iteration of the for loop
        // i = 0, flag = true. So the while loop will run until c = 6 at which point
        // if(i>c || c>5) = if(0>6 || 6>5) = if(false || true) = true. Once the if condition results in true
        // the while loops stops as flag is set to false
        // since there is nothing to turn the flag back to true each subsequent iteration of
        // the for loop does not enter the while and does there fore nothing updates c
        // eventually c is printed and is equal to 6
    }
}
