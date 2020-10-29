package com.github.pwnmn.design_patterns.creational.factory_abstract.animal;

public class Duck implements Animal {
    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quack";
    }
}
