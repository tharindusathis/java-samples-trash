package com.github.tharindusathis.temp;

import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Supplier;

class TempTest
{
    public <T> T myMethod(T value)
    {
        System.out.print("value is: " + value);
        System.out.println("\ttype is: " + value.getClass().getSimpleName());
        return value;
    }
    public Object myMethod2(Object value)
    {
        System.out.print("value is: " + value);
        System.out.println("\ttype is: " + value.getClass().getSimpleName());
        return value;
    }

    @Test
    void test(){
        System.out.println(myMethod(123).getClass().getSimpleName());
        System.out.println(myMethod("Hi there").getClass().getSimpleName());
        System.out.println(myMethod2(123).getClass().getSimpleName());
        System.out.println(myMethod2("Hi there").getClass().getSimpleName());
    }

    @Test
    void test1(){
//        int x = new myClass<Integer>().get();
//        String y = new myClass<String>().get();

        System.out.println(
                addHalf.apply( 5 )
        );

    }

    Function<Integer, Double> addHalf = x -> x + .5;
    Function<Integer, String> myFunct = a -> a.toString();
}

class myClass<T> implements Supplier<T>{
    T object;

    @Override
    public T get()
    {
        return object;
    }
}