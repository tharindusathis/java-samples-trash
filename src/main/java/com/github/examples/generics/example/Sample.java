package com.github.examples.generics.example;

import java.util.function.Function;

public class Sample
{
    public static void main( String[] args )
    {
        Function<Integer, Double> addHalf = xx -> xx + 0.5;

        System.out.println( addHalf.apply( 4 ) ); // prints 4.5
    }
}
