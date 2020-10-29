package com.github.pwnmn.design_patterns.creational.factory_abstract.factory;

import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Blue;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Color;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Red;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Yellow;

public class ColorFactory implements AbstractFactory<Color> {
    public enum ColorType {
        Blue, Red, Yellow
    }

    @Override
    public Color create(String colorType) {
        var type = ColorFactory.ColorType.valueOf(colorType);
        Color result = switch(type) {
            case Blue -> new Blue();
            case Red -> new Red();
            case Yellow -> new Yellow();
            default -> null;
        };

        if(result == null) {
            throw new IllegalArgumentException("Not a valid color");
        }

        return result;
    }
}
