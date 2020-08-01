package com.github.examples.functional_interfaces.a3_functional_interfaces_ex1;

@FunctionalInterface
interface Calculator {
    int giveAnswer(int val1, int val2);
}

public class Demo {
    public static void main(String[] args) {
        // normal way, implementing the Calculator interface
        Calculator adder = new Calculator() {
            public int giveAnswer(int val1, int val2) {
                return val1 + val2;
            }
        };

        // with lambda
        Calculator adderBetter = (int val1, int val2) -> {
            return val1 + val2;
        };

        // more simplified
        Calculator adderMoreBetter = (val1, val2) -> val1 + val2;

        // even simplified with method reference
        Calculator adderMoreMoreBetter = Integer::sum;

        // any static method
        Calculator adderMoreMoreBetter2 = MySimpleMath::addTwo_aStaticMethod;

        // or with an instance method
        Calculator adderMoreMoreBetter3 = new MySimpleMath()::addTwo_anInstanceMethod;

        System.out.println("adder: " + adder.giveAnswer(3, 5));
        System.out.println("adderBetter: " + adderBetter.giveAnswer(3, 6));
        System.out.println("adderMoreBetter: " + adderMoreBetter.giveAnswer(3, 7));
        System.out.println("adderMoreMoreBetter: " + adderMoreMoreBetter.giveAnswer(3, 8));
        System.out.println("adderMoreMoreBetter2: " + adderMoreMoreBetter2.giveAnswer(3, 9));
        System.out.println("adderMoreMoreBetter3: " + adderMoreMoreBetter3.giveAnswer(3, 10));
    }
}

class MySimpleMath {
    public static int addTwo_aStaticMethod(int a, int b) {
        return a + b;
    }

    public int addTwo_anInstanceMethod(int a, int b) {
        return a + b;
    }
}


