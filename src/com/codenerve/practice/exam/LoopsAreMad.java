/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.practice.exam;

/**
 * Created on 17/01/15.
 */
public class LoopsAreMad {

    public static void main(String [] args) {

        outside: for (int i=0; i < 4; ++i){

            System.out.println(i*=2);
            System.out.println("pre incremented i= " + i );

            innner: for (int m = 0; m < 4; m++){
                if((m%4)==0) break;
            }
        }

        int i = 0;

        while (i-- > 0){
            System.out.println("i="+i);
        }

        do while (0 >= 0 ) {
            System.out.println("whaaaa");
        }
        while (0>0);

    }
}
