package com.company;

import java.util.Arrays;

public final class GuardDog extends Dog {

    private int hight = 100;
    private int weight = 50;
    Owner o = new Owner();
    TypesWool tw;

    @Override
    void makeVoice(){
        System.out.println("Мяу");
    }

    public int getHight() {
        return hight;
    }

    public int getWeight() {
        return weight;
    }

    public Owner getO() {
        return o;
    }

    public TypesWool getTw() {
        return tw;
    }




}
