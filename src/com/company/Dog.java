package com.company;

import java.util.Arrays;

public class Dog extends Pet {

    private String name;
    private String breed;
    private String[] commands;

    public Dog() {

    }

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        setColor(color);
        setShelter(shelter);
    }

    public Dog(String name, String breed, Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        setShelter(shelter);
        setCommands(commands);

    }

    final void makeVoice(String voice, int number) {
        for (int i = 0; i < 3; i++) {
            voice = "Гав";
            System.out.println(voice);
        }

    }

    void makeVoice() {
        String defaultVoice = "Аууу";
        System.out.println(defaultVoice);
    }

    public String getInfo() {

        String a = super.getInfo() + " " + name + " " + breed + " " + Arrays.toString(commands);
        return a;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
