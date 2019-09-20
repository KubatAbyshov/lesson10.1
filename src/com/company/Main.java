package com.company;

public class Main {

    public static void main(String[] args) {

        Dog objectA = new Dog();
        objectA.setShelter(new Shelter("Бобик","Домашний"));
        GuardDog objectB = new GuardDog();
        GuardDog objectC = new GuardDog();


        System.out.println(objectA.getInfo());
        System.out.println(objectB.getHight());
        System.out.println(objectC.getWeight());
        System.out.println(objectC.tw);




        Dog dog1 = new Dog();
        dog1.setShelter(new Shelter("Шарик", "Улица"));
        System.out.println(dog1.getInfo());
        dog1.makeVoice();

        Dog dog2 = new Dog("Гуч", "Алабай", Color.WHITE, new Shelter("Гриша", "Приют"));
        System.out.println(dog2.getInfo());
        dog2.makeVoice("Гав", 3);

        Dog dog3 = new Dog("Лайка", "Дворняшка", new Shelter("Бобик", "Дом"),
                new String[]{"Сидеть", "Лежать"});
        System.out.println(dog3.getInfo());
        dog3.makeVoice();

    }


}
