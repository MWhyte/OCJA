/*
 * Copyright (c) 2015 codenerve.com
 *
 * You may study, use, and modify this example. Redistribution is not permitted.
 */

package com.codenerve.ocja.chapter_2;

/**
 * Created on 14/01/15.
 */
public class Statements_Strings {

        public static class TestClass{
            public void testRefs(String str, StringBuilder sb){

                System.out.println("1 str="+str);
                System.out.println("2 sb="+sb.toString());

                str = str + sb.toString();


                System.out.println("3 str=" + str);

                sb.append(str);

                System.out.println("4 sb="+sb.toString());

                str = null;
                sb = null;
            }
        }

        public static void main(String[] args){
                String s = "aaa";
                StringBuilder sb = new StringBuilder("bbb");
                new TestClass().testRefs(s, sb);
                System.out.println("5 s="+s+" sb="+sb);
            }
}