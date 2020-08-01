package com.github.examples.functional_interfaces.a5_consumer_supplier_ex;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {

        // sample supplier
        Supplier<Integer> thisYear = () -> 2020;
        System.out.println("this year is: " + thisYear.get());

        // -----------------------------------------------------

        Person amara = new Person();
        amara.setName("AMARA");
        System.out.println("Name is: " + amara.getName());

        // need to save getter & setter for amara object
        Supplier<String> amarasNameGetter = amara::getName;
        Consumer<String> amarasNameSetter = amara::setName;
        Supplier<String> amarasNameGetter2 = amara::getNameInLongFormat;

        amara = null; // imagine that cant use the normal getters/setters from now

        // amara.getName();
        // can't call NOW, NullPointerException

        // but saved gatters & setters!!
        amarasNameSetter.accept("NIMAL");
        System.out.println("New name: " + amarasNameGetter.get());

        //-----------------------------------------------------

        // if you need to change the getter at runtime ?
        amarasNameGetter = amarasNameGetter2;
        System.out.println("New name with new getter: " + amarasNameGetter.get());

    }
}

class Person{
    String name;
    int age;

    public String getName() {
        return name;
    }
    public String getNameInLongFormat() {
        return "Mr. " + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}