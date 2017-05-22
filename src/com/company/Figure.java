package com.company;

/**
 * Created by bliNk on 07.05.2017.
 */
abstract class Figure {

    void draw() {
        System.out.println ("Рисую фигуру");
    }

    void erase() {
        System.out.println ("Стираю фигуру");
    }

    void move() {
        System.out.println ("Преремещаю фигуру");
    }

    void setColor() {
        System.out.println("Изменяю цвет фигуры");
    }

    void getColor() {
        System.out.println ("Возвращаю цвет фигуры");

    }

  public abstract double square();
}