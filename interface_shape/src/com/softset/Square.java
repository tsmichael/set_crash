package com.softset;

public  class Square implements Shape {
    int side;
    String name;
    double area;
    double perimetr;

    public Square() {}

    public Square(int side) {
        //this.name=name;
        this.side = side;
    }

    public double perimetr() {
        this.perimetr = 4 * this.side;
        return perimetr;
    }

    public double area() {
        this.area = this.side * this.side;
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
        output += "\nSquare =>";
        output += "\nName is : " + getName();
        output += "\nSide is : " + this.side;
        output += "\nPerimetr is : " + this.perimetr;
        output += "\nArea is : " + this.area;
        return output;
    }
}
