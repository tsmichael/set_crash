package com.softset;

public class Circle implements Shape {
    int radius;
    String name;
    double area;
    double perimetr;

    public Circle() {}

    public Circle(int radius) {
        this.radius = radius;
    }

    public double perimetr() {
        this.perimetr = 2 * this.radius * 3.14;
        return perimetr;
    }

    public double area() {
        this.area = 3.14 * this.radius * this.radius;
        return area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String print() {
        String output = "";
        output += "\nCircle =>";
        output += "\nName is : " + getName();
        output += "\nRadius is : " + this.radius;
        output += "\nPerimetr is : " + perimetr;
        output += "\nArea is : " + area;
        return output;
    }
}
