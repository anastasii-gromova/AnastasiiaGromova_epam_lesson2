package com.epam;

import org.apache.log4j.Logger;

public class App
{

    private static Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args)
    {
        logger.info("I'm info");
        
        for (int i=1; i<=100; i++)
            {
                if(i%15==0)System.out.print("FizzBuzz");
                else
                if(i%3==0)System.out.print("Fizz");
                else
                if(i%5==0)System.out.print("Buzz");
            }
    }
}
