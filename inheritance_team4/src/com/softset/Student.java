package com.softset;

public class Student {

    private String name;
    private String surname;
    public int age;
    public int course;

    public Student()
    {

    }

    public Student(String name,String surname,int age,int course)
    {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.course=course;

    }

    public void setName(String name)
    {
        this.name=name;
    }
    public void setSurname(String surname)
    {
        this.surname=surname;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public void setCourse(int course)
    {
        this.course=course;
    }

    public String getName()
    {
        return name;
    }

    public String getSurname()
    {
        return surname;
    }

    public int getAge()
    {
        return age;
    }

    public int getCourse()
    {
        return course;
    }

    public void Info() {

        System.out.println("Name : " + name);
        System.out.println("Surname :" + surname);
        System.out.println("Age : " + age);
        System.out.println("course :" + course);

    }

}

