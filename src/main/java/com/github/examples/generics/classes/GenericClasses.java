package com.github.examples.generics.classes;

public class GenericClasses
{
    public static void main( String[] args )
    {
        Apple myApple = new Apple();
        Apple myApple2 = new Apple();

        Plastic plasticMaterial = new Plastic();

        Box<Apple, Plastic> appleBox = new Box<>(plasticMaterial, myApple);

        Pen pen1 = new Pen();
        Box<Pen , Plastic> aPenBox = new Box<>();
        aPenBox.setObject( pen1 );
    }

}

class Pen{
}

class Apple{
}

class Plastic{
}


class Box<T,S>{
    T object;
    S materialType;

    public Box(){}
    public Box(S materialType, T object){
        this.materialType = materialType;
        this.object = object;
    }

    public void setObject( T object){
        this.object = object;
    }
    public void setMaterialType(S materialType){
        this.materialType = materialType;
    }
}


