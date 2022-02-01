package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Kalkulacka calculator = new Kalkulacka();
        Scanner scn = new Scanner(System.in);
        calculator.a = scn.nextInt();
        calculator.b = scn.nextInt();

        calculator.scitaj();
        int vysledok = calculator.odcitaj();
        System.out.println("Odčítanie: " + vysledok);

        System.out.println("Vynásobenie: " + calculator.vynasob());
        System.out.println("Vydelenie: " + calculator.vydel());
    }
}
