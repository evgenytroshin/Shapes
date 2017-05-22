package com.company;

/**
 * Created by bliNk on 08.05.2017.
 */
public class Romb extends Figure {
    private int a;
    private int h; //Height

    public Romb(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double square() {return a*h;}
}
