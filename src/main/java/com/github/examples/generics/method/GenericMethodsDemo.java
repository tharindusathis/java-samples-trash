package com.github.examples.generics.method;

public class GenericMethodsDemo
{
    public static void main( String[] args )
    {
        sayHi( "abc" );
        sayHi( "123" );
        sayHiBetter( "abc" );
        sayHiBetter( "123" );
        sayHiBetter( "123.23" );
    }

    public static void sayHi(String value){
        System.out.print("My value is " + value + ". ") ;
        System.out.println(value.getClass().getSimpleName());
    }

    public static void sayHi(Integer value){
        System.out.print("My value is " + value + ". ") ;
        System.out.println(value.getClass().getSimpleName());
    }

    public static <T> void sayHiBetter( T value){
        System.out.print("My value is " + value + ". ") ;
        System.out.println(value.getClass().getSimpleName());
    }
}




