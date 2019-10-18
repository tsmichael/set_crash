package com.softset;

import java.io.*;
import java.util.ArrayList;

public class Main {

public static void main(String[] args) throws IOException {
        ArrayList<Car> Mech =new ArrayList<Car>();
        InputStreamReader stream_reader = new InputStreamReader(System.in);
        BufferedReader keyboard = new BufferedReader(stream_reader);
        System.out.println("Input quantity of cars: ");
        int quantity= Integer.parseInt(keyboard.readLine());
        System.out.println("Input Price reduction percentage ");
        double discount = Double.parseDouble(keyboard.readLine());

        for(int i = 0;i<quantity;i++) {

            boolean process = true;
            Car auto = new Car("yellow", 158550);
            System.out.println("New OBJECT fill data");
            while (process) {
                System.out.println("Menu : ");
                System.out.println(" 1) Call construct with parameters ");
                System.out.println(" 2) Input data of class from keyboard");
                System.out.println(" 3) Get a discount (Better use after point 1 or 2) ");
                System.out.println(" 4) Print data (Better use after first three points");
                System.out.println(" 5) ToString data (Better use after first three points\n");
                System.out.println(" 6) End work with this object. Next object / Quit ");
                System.out.println("Choose what to do: ");
                int choice = Integer.parseInt(keyboard.readLine());
                switch (choice) {
                    case 1:
                        auto=new Car("black",458712);
                        break;
                    case 2:
                        auto.input();
                        break;
                    case 3:
                        auto.changePrice(discount);
                        break;
                    case 4:
                        auto.print();
                        break;
                    case 5:
                        System.out.println(auto);
                        break;
                    case 6:
                        process = false;
                        break;
                    default:
                        System.out.println("Nazar! Start work correctly! ");
                        break;
                }
            }
            Mech.add(auto);
        }
        int iterator=1;
        for(Car object: Mech){
            System.out.println(iterator + ".\n"+object);
            iterator++;
        }


    }
}

