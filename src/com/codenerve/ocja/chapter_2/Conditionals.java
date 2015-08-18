/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

/**
 * Created on 14/01/15.
 */
public class Conditionals {

    // default constructor used to illustrate another example
    Conditionals() {}

    public static void main(String [] args) {

        // if
        basicIf();
        basicIfNoBrackets();
        emptyIfStatement();

        // if else
        basicIfElse();
        basicIfElseNoBrackets();

        // if then else
        basicIfThenElse();
        basicIfElseThenNoBrackets();
        theDanglingElseIssue();

        // switch see @SwitchStatements.java
    }

    private static void basicIf() {
        if(true){
            System.out.println("True");
        }

        // never executes but compiles
        if(false){
            System.out.println("False");
        }
    }

    private static void basicIfNoBrackets() {
        if(true)
            System.out.println("True");
    }

    private static void basicIfElse() {
        if(false){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    private static void basicIfElseNoBrackets() {
        if(false)
            System.out.println("True");
         else
            System.out.println("False");
    }

    private static void basicIfThenElse() {

        int i = 0;

        if(i == 0){
            System.out.println("Zero");
        } else if (i == 1) {
            System.out.println("One");
        } else {
            // note runtime exception so no need to catch or throw in method signature
            throw new NumberFormatException("Don't Know");
        }
    }

    private static void basicIfElseThenNoBrackets() {
        int i = 0;

        if(i == 0)
            System.out.println("Zero");
        else if (i == 1)
            System.out.println("One");
        else
            System.out.println("Don't Know");
    }

    private static void emptyIfStatement() {
        // empty conditions are valid!
        if (false) ; else ;

        // even partially ones
        if (false) ; else {
            System.out.println("just the else");
        }
        // or
        if (true) {
            System.out.println("just the if");
        } else ;
    }

    private static void theDanglingElseIssue() {

        String[] args = {"open", "no one"};
        // without formatting it would be easy to conclude that the else
        // is 'owned' by the outer most if
        // this is ot the case
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]);
    }
}