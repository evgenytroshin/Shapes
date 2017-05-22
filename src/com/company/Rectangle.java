package com.company;

/**
 * Created by bliNk on 08.05.2017.
 */
public class Rectangle extends Figure {
    private int a;
    private int b;
    public   Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        return a*b;
    }
}

