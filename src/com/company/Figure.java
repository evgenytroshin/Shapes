package com.company;

/**
 * Created by bliNk on 07.05.2017.
 */
abstract class Figure {
    double s,p,h;
    int a,b,c;



    String draw() {
        return ("Рисую фигуру");
    }

    String erase() {
        return ("Стираю фигуру");
    }

    String move() {
        return ("Преремещаю фигуру");
    }

    String setColor() {
        return ("Задаю цвет фигуры");
    }

    String getColor() {
        return ("Возвращаю цвет фигуры");

    }
    double square(){
        return s;
    }



}
