package com.company;

import java.util.Random;

public class Pet {

    private int age;
    private Color color;
    private Shelter shelter;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    private int generateDefaultAge(){
        Random r = new Random();
        int random = r.nextInt(10)+1;
        return this.age = random;

    }


    public String getInfo(){
        String all = getAge()+ " " + getColor()+ " " + getShelter().getName() + " " + getShelter().getAddress();
        return all;
    }
}
