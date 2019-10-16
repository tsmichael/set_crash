package com.softset;

public class Other extends Student {
    public String faculty;

    public Other()
    {

    }
    public Other(String name,String surname,int age,int course,String faculty)
    {
        super(name,surname,age,course);
        this.faculty=faculty;
    }
    public void setFaculty(String faculty)
    {
        this.faculty=faculty;
    }
    public void Action()
    {
        System.out.println("Doing nothing / Wasted life");
    }
    @Override
    public void Info()
    {
        super.Info();
        System.out.println("Faculty  "+faculty);
        Action();
    }

}
