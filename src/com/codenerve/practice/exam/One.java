/*
 * Copyright (c) 2014 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.practice.exam;

/**
 * Created by codenerve.com on 07/10/2014.
 */
public class One {

        public static void main(String args[]) {
            int counter = 0;
            outer:
            for (int i = 0; i < 3; i++) {
                middle:
                for (int j = 0; j < 3; j++) {
                    inner:
                    for (int k = 0; k < 3; k++) {
                        if (k - j > 0) {
                            break middle;
                        }
                        counter++;
                    }
                }
            }
            System.out.println(counter);
        }
}