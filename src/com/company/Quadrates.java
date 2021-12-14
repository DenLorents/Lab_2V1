package com.company;

import java.util.ArrayList;
import java.util.List;

public class Quadrates {
    private final List<Quadrate> quadrates;

    public Quadrates(){
        quadrates = new ArrayList<>();
    }

    public List<Quadrate> getQuadrates() {
        return quadrates;
    }

    public void add(Quadrate quadrate) {
        this.quadrates.add(quadrate);
    }

    public void remove(Quadrate quadrate) {
        this.quadrates.remove(quadrate);
    }

    public void fillRandom(int n){
        for (int i = 0; i < n; i++) {
            quadrates.add(Quadrate.generate());
        }
    }

    public void MinPerimetr(){
        int min = 1000;
        for (Quadrate quadrate : this.quadrates){
            if (quadrate.Perimetr() < min){
                min = quadrate.Perimetr();
            }
        }
        System.out.println("\nЧетырехугольник с минимальным периметром: ");
        for (Quadrate quadrate : this.quadrates){
            if (min == quadrate.Perimetr()){
                System.out.println(quadrate);
            }
        }
    }

    @Override
    public String toString() {
        return "\nЧетырехугольники:" + quadrates + "; ";
    }
}