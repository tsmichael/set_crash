package com.softset;

public class Technical extends Student{
    public String faculty;

    public Technical() {

    }

    public Technical(String name, String surname, int age, int course, String faculty) {
        super(name, surname, age, course);
        this.faculty = faculty;
    }

    public void SetFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void Action() {
        System.out.println("Doing CODE");
    }

    @Override
    public void Info() {
        super.Info();
        System.out.println("Faculty " + faculty);
        Action();
    }


}
