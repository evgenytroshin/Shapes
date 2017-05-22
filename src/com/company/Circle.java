package com.company;

/**
 * Created by bliNk on 08.05.2017.
 */
public class Circle extends Figure {

    private int r; //Radius

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double square() {return Math.PI*Math.pow(r,2);
    }
}
