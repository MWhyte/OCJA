/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

import java.awt.*;

/**
 * Created on 19/01/15.
 */
public class DataTypes {

/*
    Type	    Contains	                Default	    Size	    Range
    boolean	    true or false	            false	    1 bit	    NA
    char	    Unicode character	        \u0000	    16 bits	    \u0000 to \uFFFF
    byte	    Signed integer	            0	        8 bits	    -128 to 127
    short	    Signed integer	            0	        16 bits	    -32768 to 32767
    int	        Signed integer	            0	        32 bits	    -2147483648 to 2147483647
    long	    Signed integer	            0	        64 bits     -9223372036854775808 to 9223372036854775807
    float       IEEE 754 floating point     0.0	        32 bits     ±1.4E-45 to ±3.4028235E+38
    double      IEEE 754 floating point     0.0	        64 bits     ±4.9E-324 to ±1.7976931348623157E+308
*/


    public static void main(String [] args) throws AWTException {


        int x;

        // compilation error. local variables must be initialised before use
        //System.out.println(x);

        // double's can contain D to signify double
        double a = 1D;

        operationsThatCauseConversions();
    }


    private static void operationsThatCauseConversions() {
        System.out.println("Operations That Cause Conversions");

        byte a = 10;
        byte b = 2;
        // a/b returns an int which must be cast
        byte c = (byte) (a/b);
        System.out.println(c);

        // in some cases this would lead to a loss in precision
        byte a1 = 64;
        byte b1 = 2;
        byte c1 = (byte) (a1*b1);
        System.out.println("Expect 128 but c1 = " + c1);
        // this is because a byte is only 8 bits. Range -128 to 127
        // so some bits are cut off (left most)

        // to avoid assign to int and do not cast
        int d1 = a1/b1;
        System.out.println("Expect 128 and d1 = " + d1);

        // n.b. that assigning the resulting byte c1 to int will not work
        // the precision loss has already occurred
        d1 = c1;
        System.out.println("Expect 128 and d1 = " + d1);


        // DIVISION OF A long CAUSES THE RESULT TO BE A DOUBLE WITHOUT CASTING
        long w = 50;
        long x = 10;

        long y = w/x;
        double z = w/x;
        // the same loss of precision can occur. To avoid java can return a double
        // which is floating point which holds a larger range

        // long 64 bits.   range -9223372036854775808 to 9223372036854775807
        // double 64 bits. range ±4.9E-324 to ±1.7976931348623157E+308









    }
}
