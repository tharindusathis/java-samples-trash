package com.github.examples.functional_interfaces.a06;

import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {

        // function with Interger input & String output!
        Function<Integer, String> myFunct = value -> value + "hi";

        System.out.println(myFunct.apply(34));

        // change function at runtime??
        int x = 4;
        if(x>2){
            myFunct = value -> value + "bye";
        }else{
            myFunct = value -> value + "still_Hi";
        }

        System.out.println(myFunct.apply(123));
    }
}
