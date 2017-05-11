package com.company;

/**
 * Created by bliNk on 08.05.2017.
 */
public class Triangle extends Figure {
    int a; //Основание треугольника
    int b;
    int c;


    double square () {

        double p = (a+b+c)/2;
        double h = 2/a*(p*(p-a)*(p-b)*(p-c));
        s= 1/2*a*h;
        return s;
    }
}
