package com.company;

/**
 * Created by bliNk on 08.05.2017.
 */
public class Square extends Figure {
    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double square() {return a*a;}
}