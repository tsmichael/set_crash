package com.softset;
import java.io.*;


public class Car {

    public String color;
    private double price;
    public  final String CompanyName="SoftServe";

    public Car() {}

    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void input()throws IOException {
        InputStreamReader stream_reader=new InputStreamReader(System.in);
        BufferedReader keyboard= new BufferedReader(stream_reader);
        System.out.println("Input color of car: ");
        color=keyboard.readLine();
        System.out.println("Input car`s price: ");
        price=Double.parseDouble(keyboard.readLine());
    }

    public void print(){
        System.out.println("--CAR DATA--");
        System.out.println("Car`s color: "+color);
        System.out.println("Car`s price: "+price);
        System.out.println("Company: "+CompanyName);
        if(getColor().equals("white")) {
            System.out.println("\nWe will repair your car,Nazar ^-^");
        }
    }

    public double changePrice(double percent){
        this.price-=price*percent/100;
        System.out.println("Congratulation your discount "+percent+"% available");
        return price;
    }


    @Override
    public String toString(){
        String output=" ";
        output+="Type: Car";
        output+="\nColor: "+this.color;
        output+="\nPrice: "+this.price;
        output+="\nCompany: "+this.CompanyName;
        if(getColor().equals("white")) {

            output+="\nWe will repair your car,Nazar ^-^";
        }
        return output;
    }
}
