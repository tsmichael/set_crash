package com.softset;

public class Dog {
    private String name;
    private String mark;
    private int age;

    public Dog()
    {

    }
    public Dog(String name,String mark,int age)
    {
        this.name= name;
        this.mark=mark;
        this.age=age;

    }

    public String getName()
    {
        return this.name;
    }
    public String getMark()
    {
        return this.mark;
    }
    public int getAge()
    {
        return this.age;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setMark(String mark)
    {
        this.mark=mark;
    }
    public void setAge(int age)
    {
        this.age=age;
    }
    public void Info()
    {
        System.out.println("Dog`s name: "+name);
        System.out.println("Dog`s mark: "+mark);
        System.out.println("Dog`s age: "+age);
    }


    public static void main(String[] args)
    {

        Dog myDog= new Dog("Bonjomi","Haski",8);
        myDog.Info();
        Dog oneDog=new Dog();
        oneDog.setName("Humburger");
        oneDog.setMark("Korgi");
        oneDog.setAge(9);
        oneDog.Info();

    }
}
