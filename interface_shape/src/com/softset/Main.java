package com.softset;

import java.lang.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] NamesArray = {"Merkuriy", "Yoda", "ReyMisterio", "Soda", "Messi", "Naruto", "BulvarDEPO", "ASAP", "Lesya", "Vitalik"};
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        Scanner keyboard = new Scanner(System.in);
        int random_len;

        for (int i = 0; i < 10; i++) {

            System.out.println("Make your choice: ");
            System.out.println(" 1) Shape_of_SQUARE");
            System.out.println(" 2) Shape_of_CIRCLE");

            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    random_len = (int) (5 + Math.random() * 10);
                    Shape square = new Square(random_len);
                    square.setName(NamesArray[i]);
                    square.area();
                    square.perimetr();
                    shapes.add(i,square);
                    break;

                case 2:
                    random_len = (int) (5 + Math.random() * 10);
                    Shape circle = new Circle(random_len);
                    circle.setName(NamesArray[i]);
                    circle.area();
                    circle.perimetr();
                    shapes.add(i,circle);
                    break;

                default:
                    System.out.println("Make choice from 1 to 2");
                    i = i - 1;
                    break;
                }
        }

        int iterator = 1;
        for (Shape object : shapes) {
            System.out.println("\n"+iterator + "." + object.print());
            iterator++;

        }
        int maxindex=0;
        for(int i=0;i<shapes.size()-1;i++) {
            if(shapes.get(maxindex).perimetr()<shapes.get(i).perimetr()){
                maxindex=i;
            }
        }
        System.out.println("\n\nThe Largest Perimetr has SHAPE with name :=> ");
        System.out.println(shapes.get(maxindex).getName());

    }
}
