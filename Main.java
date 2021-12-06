package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] rnd = new int[20];
        int a, b, c = 0;

        for(int i = 0; i < 20; i++){
            int rnum = (int)(Math.random() * 50);
            rnd[i] = rnum + 1;
            a = rnd[i];
            b = c;
            c = a + b;
        }

        for(int nums : rnd){
            System.out.print(nums + ", ");
        }

        float average = c/20;
        Arrays.sort(rnd);
        System.out.println("\nSum: " + c + ", " + "Average: " + average);
        System.out.println("Highest value: " + rnd[19] + ", " + "Lowest value: " + rnd[0]);
    }
}
