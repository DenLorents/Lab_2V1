package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(3)+1;
        Quadrates quadrates = new Quadrates();
        quadrates.fillRandom(n);
        System.out.println(quadrates);
        quadrates.MinPerimetr();

        n = r.nextInt(3)+1;
        Rhombuses rhombuses = new Rhombuses();
        rhombuses.fillRandom(n);
        System.out.println(rhombuses);
        rhombuses.MediumArea();
    }
}
