/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_9;

/**
 * Created on 21/01/15.
 */
public class ThrowingNullEx {


    // code compiles however re is now so when throwing null
    // a NPE is raised
    public static void main(String args[]){
        try{
            RuntimeException re = null;
            throw re;
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    // 7 is un reachable as finally always does the return so commented out
    // other combo's are:
    // Remove line 3, 6
    // Remove line 5, 6
    // Remove line 3, 7
    // try each and understand why they will compile

    public float parseFloat( String s ){
        float f = 0.0f;      // 1
        try{
            f = Float.valueOf( s ).floatValue();    // 2
            return f ;      // 3
        }
        catch(NumberFormatException nfe){
            f = Float.NaN ;    // 4
            return f;     // 5
        }
        finally {
            return f;     // 6
        }
        //return f ;    // 7
    }
}
