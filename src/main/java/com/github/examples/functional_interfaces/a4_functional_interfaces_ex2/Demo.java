package com.github.examples.functional_interfaces.a4_functional_interfaces_ex2;

public class Demo {
    public static void main(String[] args) {
        Hello hello1 = new Hello() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };


        Hello hello2 = name -> System.out.println("Helloo " + name);
        // (name) -> {...} OR  name -> {...}  *parenthesis optional for one!
        // () -> {...}
        // (a, b, c) -> {...}


        Hello hello3 = System.out::println;

        hello1.sayHello("Amara");
        hello2.sayHello("Nimal");
        hello3.sayHello("Hellooo Saman");
    }
}

@FunctionalInterface
interface Hello{
    void sayHello(String name);
}
