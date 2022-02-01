package com.company;

public class Main {

    public static void main(String[] args) {

        Zdravic z = new Zdravic();
        z.text = "hej";
        z.pozdrav("Amdrejd");

        Zdravic x = new Zdravic();
        x.text = "nazdar";
        Zdravic y = new Zdravic();
        y.text = "caw";

        x.pozdrav("Brothel");
        y.pozdrav("Jamal");
    }
}
