package com.github.pwnmn.design_patterns.creational.factory_abstract.animal;

public class Dog implements Animal {
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Wuff";
    }
}
