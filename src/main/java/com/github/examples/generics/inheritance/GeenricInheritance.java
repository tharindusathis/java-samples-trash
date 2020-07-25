package com.github.examples.generics.inheritance;

public class GeenricInheritance
{
    public static void main( String[] args )
    {
        AppleJuice a = new AppleJuice();
        Bottle<AppleJuice> b = new Bottle<>();
        b.setObject( a );

        FruitBottle<AppleJuice> appleJuiceBottle = new FruitBottle<>();
        FruitBottle<FruitJuice> juiceBottle2 = new FruitBottle<>();
//        FruitBottle<Juice> juiceBottle3 = new FruitBottle<>();  // ERROR
//        FruitBottle<Liquid> juiceBottle4 = new FruitBottle<>(); // ERROR
    }
}

class Liquid{
}

class Juice extends Liquid
{
}

class FruitJuice extends Juice implements FruitTasty
{
}

class AppleJuice extends FruitJuice
{
}

class ThickAppleJuice  extends AppleJuice
{
}


interface FruitTasty{
}

class Bottle<T>{
    T object;
    public void setObject(T object){
        this.object = object;
    }
}

class FruitBottle<T extends FruitJuice>{
    T object;
    public void setObject(T object){
        this.object = object;
    }
}
class FruitBottle2<T extends FruitTasty>{
    T object;
    public void setObject(T object){
        this.object = object;
    }
}

