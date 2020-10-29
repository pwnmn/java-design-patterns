package com.github.pwnmn.design_patterns.creational.factory_abstract.animal;

public class Tiger implements Animal {
    @Override
    public String getAnimal() {
        return "Tiger";
    }

    @Override
    public String makeSound() {
        return "Rawr";
    }
}
