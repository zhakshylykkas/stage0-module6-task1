package com.epam.mjc.stage0;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        System.out.println(bird.getDescription());

        Animal dog = new Dog();
        System.out.println(dog.getDescription());
    }
}
