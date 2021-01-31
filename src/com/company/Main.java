package com.company;

public class Main {

    byte age = 0;//-128 - 128
    short veight = 1234; //-32 - 32
    static int i = 231243; // 4 byte
    long l = 3214124; // 8 byte
    static float f = 12.312f; // 4 byte
    double d = 123.3213; // 8 byte
    boolean bool = true; // true/false

    char c ='a';
    String s = "Help!";


    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.color);
        Humen humen1 = new Humen();
        System.out.println(humen1.getAge(i,f,humen1));
	// write your code here
    }
}

