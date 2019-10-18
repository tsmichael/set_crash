package com.softset;

public class Main {

    public static void main(String[] args) {

        Builder nazar = new Builder("Nazar",23,3000);

        nazar.calculateSalary(3000);
        nazar.calculateTo50(23);
        nazar.run();
    }
}
