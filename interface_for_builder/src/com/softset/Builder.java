package com.softset;

public class Builder implements Person,Emploee{
    public int age;
    public int salary_perhour;
    public String name;

    public Builder(){}

    public Builder(String name,int age,int salary_perhour){
        this.name=name;
        this.age=age;
        this.salary_perhour=salary_perhour;
    }
    public void run(){
        System.out.println(" BUILDER is running ");
    }

    public void calculateTo50(int age) {
        int timeLeft = 50-age;
        System.out.println("Years left to 50 <= "+timeLeft);
    }

    public void calculateSalary(int salary_perhour){
        int salary=salary_perhour*160;
        System.out.println("Salary per month "+salary);

    }
}
