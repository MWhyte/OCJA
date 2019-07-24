package com.codenerve.ocja.chapter_1;

/**
 * Created by codenerve.com on 07/10/2014.
 */

// static imports introduced in java 5.0
import static java.lang.System.*;

// strangely java.lang can be imported
// this is done by the jvm automatically though
import java.lang.*;

// other things on imports

// cannot import classes from same file as a public class
// import com.codenerve.ocja.chapter_1.Blocks.AClass;

public class ClassToBeImported {

    // this is run when the class is instantiated
    // n.b. that without a main  method this class would compile (javac ClassToBeImported)
    // but any attempt to run (java ClassToBeImported) would throw an Error (not an exception)
    // this is not because of this block but simply as there is no main to start the program
    static {
        System.out.println("Static block");
    }

    public static void main(String [] args) {
        // out is a static method and can therefore be statically imported
        // using import static java.lang.System.*;
        out.print("A");
    }
}
