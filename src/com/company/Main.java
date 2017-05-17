package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double totalSquare=0;
        List<Figure> shapes = new ArrayList<Figure>();
        Square sq1 = new Square();
        sq1.a=3;
        Square sq2 = new Square();
        sq2.a=4;
        Square sq3 = new Square();

        
        sq3.a=5;
        Triangle tr1 = new Triangle();
        tr1.a =5; tr1.b=4; tr1.c=3;
        Circle cr1 = new Circle();
        cr1.r=3;
        Circle cr2 = new Circle();
        cr2.r=4;
        Circle cr3 = new Circle();
        cr3.r=5;
        shapes.add(cr1);
        shapes.add(cr2);
        shapes.add(cr3);
        shapes.add(sq1);
        shapes.add(sq2);
        shapes.add(sq3);
        for(int i=0; i<shapes.size();i++){

            totalSquare = totalSquare + shapes.get(i).square();
        }
        System.out.println(totalSquare);







}
}
