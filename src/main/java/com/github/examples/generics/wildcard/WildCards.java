package com.github.examples.generics.wildcard;

public class WildCards
{
    public static void main( String[] args )
    {
        Bottle<AppleJuice> myAppleJuiceBottle = new Bottle<>();
        Bottle<Liquid> myLiquidBottle = new Bottle<>();

        WildCards.addJuiceToGlass( myAppleJuiceBottle );
//        WildCards.addJuiceToGlass( myLiquidBottle ); // ERROR

        Bottle<ThickAppleJuice> thickJuiceBottle = new Bottle<>();

//        WildCards.addLiquidToThinGlass( thickJuiceBottle ); // ERROR
        WildCards.addLiquidToThinGlass( myAppleJuiceBottle );

        WildCards.addJuiceToGlass( thickJuiceBottle );
    }
    public static void addJuiceToGlass(Bottle<? extends Juice> aJuiceBottle){
    }
    public static <T> void addJuiceToGlass1(Bottle<? extends Juice> aJuiceBottle){
    }
    public static void addLiquidToThinGlass(Bottle<? super AppleJuice> aJuiceBottle){
    }

}

class Liquid{
}

class Juice extends Liquid{
}

class FruitJuice extends Juice implements FruitTasty
{
}

class AppleJuice extends FruitJuice{
}

class ThickAppleJuice  extends  AppleJuice{
}


interface FruitTasty{
}

class Bottle<T>{
    T object;
    public void setObject(T object){
        this.object = object;
    }
}

class FruitBottle<T extends FruitTasty>{
    T object;
    public void setObject(T object){
        this.object = object;
    }
}

