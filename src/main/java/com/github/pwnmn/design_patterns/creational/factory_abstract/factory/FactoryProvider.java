package com.github.pwnmn.design_patterns.creational.factory_abstract.factory;

public class FactoryProvider {
    public enum FactoryTypes {
        Color, Animal
    }

    public static AbstractFactory getFactory(String factoryType) {
        var type = FactoryProvider.FactoryTypes.valueOf(factoryType);
        AbstractFactory result = switch(type) {
            case Color -> new ColorFactory();
            case Animal -> new AnimalFactory();
            default -> null;
        };

        if(result == null) {
            throw new IllegalArgumentException("Not a valid factory");
        }

        return result;
    }
}
