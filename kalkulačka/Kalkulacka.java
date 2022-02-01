package com.company;

public class Kalkulacka {
    public int a;
    public int b;

    public void scitaj(){
        int vysledok = a+b;
        System.out.println("Súčet: " + vysledok);
    }
    public int odcitaj() {
        return a-b;
    }
    public int vynasob(){
        return a*b;
    }
    public double vydel(){
        if(b == 0) {
            System.out.println("čo robíš");
            return 0;
        }
        return (double) a/(double) b;
    }

}
