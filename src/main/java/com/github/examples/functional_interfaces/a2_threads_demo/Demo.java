package com.github.examples.functional_interfaces.a2_threads_demo;

public class Demo {
    public static void main(String[] args) {
        System.out.println("main thread!");


        // old way
        Thread secondThread = new Thread(
                new Runnable() {
                    public void run() {
                        System.out.println("Second thread!!");
                    }
                }
        );
        secondThread.start();

        // with lambda! not that Runnable interface is a functionalInterface
        Thread thirdThread = new Thread(() ->
        {
            System.out.println("Third thread!!!");
            // ...
            // ...
        }
        );
        thirdThread.start();


        // even simple
        new Thread(() -> System.out.println("Fourth thread!!!!")).start();


    }


}
