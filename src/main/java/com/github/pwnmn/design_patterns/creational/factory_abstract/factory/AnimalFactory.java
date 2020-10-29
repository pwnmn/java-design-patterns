package com.github.pwnmn.design_patterns.creational.factory_abstract.factory;

import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Animal;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Dog;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Duck;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Tiger;

public class AnimalFactory implements AbstractFactory<Animal> {
    public enum AnimalType {
        Dog, Duck, Tiger
    }

    @Override
    public Animal create(String animalType) {
        var type = AnimalType.valueOf(animalType);
        Animal result = switch(type) {
            case Dog -> new Dog();
            case Tiger -> new Tiger();
            case Duck -> new Duck();
            default -> null;
        };

        if(result == null) {
            throw new IllegalArgumentException("Not a valid animal");
        }

        return result;
    }
}
