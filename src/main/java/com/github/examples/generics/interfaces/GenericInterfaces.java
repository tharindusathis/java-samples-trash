package com.github.examples.generics.interfaces;

interface hasId<T>{
    public T getId();
}

abstract class Person<T> implements hasId<T>{
}

class SLPerson extends Person<String>{
    public String getId(){
        return "923323434V";
    }
}
class USPerson extends  Person<Integer>{
    public Integer getId()
    {
        return 34234;
    }
}

class Student implements hasId<String>{
    public String getId(){
        return "EN12345";
    }
}
class Book implements  hasId<Integer>{
    public Integer getId()
    {
        return 34234;
    }
}
