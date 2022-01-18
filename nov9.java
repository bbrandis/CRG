package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadaj kilometre pre 1. deň: ");
        double d1 = sc.nextInt();
        System.out.print("Zadaj cieľové kilometre: ");
        double fd = sc.nextInt();
        double dst = fd;
        int c = 0;

        while (d1 < dst) {
            d1 = (d1+d1*0.10);
            c++;
        }
        if (dst < d1) {
            System.out.println("Na " + c + ". deň prebehneš " + d1 + " kilometrov.");
        }

        System.out.println("********");
      /**/

        System.out.print("Zadaj číslo: ");
        int i = sc.nextInt() - 3;
        int a = 1;
        int b = 0;
        int d = 1;
        int result = 0;

            System.out.print(a + ", ");
            System.out.print(c + ", ");
            while (b <= i) {
            result = a + d;
            System.out.print(result + ", ");
            a = d;
            d = result;
            b++;
            }
            System.out.println("\n********");

        /**/

        int prevent = 0;
        int money = 100;
        while (prevent != 1 || money <= 0) {
            Random rnd = new Random();
            System.out.print("Vyber stávku: Čierna = 1, Červená = 2:\n");

            int color = sc.nextInt();
                if (money > 0 ){
                        System.out.println("Váš zostatok: " + money);
                        System.out.print("Koľko chcete staviť?: ");
                        int bet = sc.nextInt();
                        if (money < bet) {
                        System.out.println("Nemáte dostatok peňazí!");
                }
                else {
                        int choice = rnd.nextInt(2);
                        if (color == choice) {
                        System.out.println("Vyhrali ste stávku.");
                        money = money + bet;
                        System.out.println("Váš zostatok: " + money);
                        }
                        else {
                        System.out.println("Prehrali ste stávku.");
                        money = money - bet;
                        System.out.println("Váš zostatok: " + money);
                        }
                        if (money <= 0) {
                        System.out.println("Skrachovali ste!");
                        break;
                        }
                }

            }
        }
    }
}