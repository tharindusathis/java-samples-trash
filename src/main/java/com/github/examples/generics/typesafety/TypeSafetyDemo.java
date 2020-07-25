package com.github.examples.generics.typesafety;

import java.util.ArrayList;

public class TypeSafetyDemo
{
    public static void main( String[] args )
    {
        ArrayList marksArray = new ArrayList();
        ArrayList<Integer> marksArrayBetter = new ArrayList<>();


        marksArray.add( 12 );
        marksArray.add( 23);
        marksArray.add( "Ten" ); // NO compile error

        marksArrayBetter.add( 12 );
        marksArrayBetter.add( 23 );
//      marksArrayBetter.add( "Ten" ); // compile error

    }
}
