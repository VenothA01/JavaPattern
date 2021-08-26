package com.dailycoder;

class DeepClone implements  Cloneable{

    int a,b;

    Base base = new Base();


    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepClone deepClone = (DeepClone) super.clone();

        deepClone.base = new Base();
        deepClone.base.x = base.x;
        deepClone.base.y = base.y;

        return deepClone;


    }
}

class Base{

    int x,y;
}

class ShallowClone implements Cloneable{

    int a,b;

    Base base = new Base();

    @Override
    protected Object clone() throws CloneNotSupportedException {

        Base base1 = (Base)super.clone();

        return  base1;
    }
}


public class Question6 {


    public static void main(String[] args) throws CloneNotSupportedException{

        DeepClone deepClone = new DeepClone();
        deepClone.a = 10;
        deepClone.b = 10;

        deepClone.base.x = 30;
        deepClone.base.y = 40;

        DeepClone deepClone1 = (DeepClone)deepClone.clone();

        deepClone1.a = 100;

        deepClone.base.x = 3000; // deep clone will not change the value;

        System.out.println(deepClone.a+" "+deepClone.b+" "+deepClone.base.x+" "+deepClone.base.y);

        System.out.println(deepClone1.a+" "+deepClone1.b+" "+deepClone1.base.x+" "+deepClone1.base.y);

        ShallowClone shallowClone = new ShallowClone();

        shallowClone.a = 10;
        shallowClone.b = 10;

        shallowClone.base.x = 30;
        shallowClone.base.y = 40;

        ShallowClone shallowClone1 = (ShallowClone)shallowClone.clone();

        shallowClone1.a = 100;
        shallowClone1.base.x=1000;

        System.out.println("==============================================");

        System.out.println(shallowClone.a+" "+shallowClone.b+" "+shallowClone.base.x+" "+shallowClone.base.y);

        System.out.println(shallowClone1.a+" "+shallowClone1.b+" "+shallowClone1.base.x+" "+shallowClone1.base.y);

    }
}
