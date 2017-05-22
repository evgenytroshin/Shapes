package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double totalSquare;
        totalSquare=0;
        Random rand;
        rand = new Random();
        List<Figure> shapes = new ArrayList<Figure>();

        for(int i=0; i<6; i++) {
            shapes.add(new Square(rand.nextInt(20)));
            shapes.add(new Circle(rand.nextInt(20)));
            shapes.add(new Rectangle(rand.nextInt(20), rand.nextInt(20)));
            shapes.add(new Triangle(3,4,5)); //Если задать рандом, то totalSquare = NaN(?)
            shapes.add(new Romb(rand.nextInt(20), rand.nextInt(20)));}


        for (int i = 0; i < shapes.size(); i++) {



            totalSquare = totalSquare + shapes.get(i).square();
        }

        System.out.println("Total Square is " + totalSquare);



    }
}
