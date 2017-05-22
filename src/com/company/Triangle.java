package com.company;

/**
 * Created by bliNk on 08.05.2017.
 */
public class Triangle extends Figure {
    private int a; //Основание треугольника
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double square() {
        double h;
        double p;
        p=(a+b+c)*0.5;
        h=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        //System.out.println("p = " + " " +p+a+b+c);
        //System.out.println("h = " + " " +h);
        return a*h/2;
    }
}
