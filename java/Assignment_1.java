package com.sapient.day6;

import java.util.Scanner;

public class Assignment_4 {
      public static void functn()
        {
            try
            {
                throw new NullPointerException("demo");
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught inside functn().");
                throw e; // rethrowing the exception
            }
        }

        public static void main(String args[])
        {
            try
            {
                functn();
            }
            catch(NullPointerException e)
            {
                System.out.println("Caught in main.");
            }
        }
    }