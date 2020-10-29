package com.github.pwnmn.design_patterns.creational.factory_abstract;

import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Animal;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Dog;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Duck;
import com.github.pwnmn.design_patterns.creational.factory_abstract.animal.Tiger;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Blue;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Color;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Red;
import com.github.pwnmn.design_patterns.creational.factory_abstract.color.Yellow;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.AbstractFactory;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.AnimalFactory;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.ColorFactory;
import com.github.pwnmn.design_patterns.creational.factory_abstract.factory.FactoryProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AbstractFactoryTest {

    @Test
    public void whenFactoryProviderInvoked_thenReturnCorrectFactory() {
        AbstractFactory<Animal> animalFac = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Animal.name());
        AbstractFactory<Color> colorFac = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Color.name());

        assertEquals(true, animalFac instanceof AnimalFactory);
        assertEquals(true, colorFac instanceof ColorFactory);
    }

    @Test
    public void whenFactoryProviderInvokedWithUnknownFactory_thenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> {
            FactoryProvider.getFactory("unknown");
        });
    }

    @Test
    public void whenAnimalFactoryInvoked_thenReturnCorrectType() {
        AbstractFactory<Animal> animalFac = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Animal.name());

        var dog = animalFac.create(AnimalFactory.AnimalType.Dog.name());
        var tiger = animalFac.create(AnimalFactory.AnimalType.Tiger.name());
        var duck = animalFac.create(AnimalFactory.AnimalType.Duck.name());

        assertEquals(true, dog instanceof Dog);
        assertEquals(true, tiger instanceof Tiger);
        assertEquals(true, duck instanceof Duck);
    }

    @Test
    public void whenAnimalFactoryInvokedWithUnknownParam_thenThrowException() {
        AbstractFactory<Animal> animalFac = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Animal.name());

        assertThrows(IllegalArgumentException.class, () -> {
            animalFac.create("unkown");
        });
    }

    @Test
    public void whenColorFactoryInvoked_thenReturnCorrectType() {
        AbstractFactory<Color> animalFac = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Color.name());

        var blue = animalFac.create(ColorFactory.ColorType.Blue.name());
        var red = animalFac.create(ColorFactory.ColorType.Red.name());
        var yellow = animalFac.create(ColorFactory.ColorType.Yellow.name());


        assertEquals(true, blue instanceof Blue);
        assertEquals(true, red instanceof Red);
        assertEquals(true, yellow instanceof Yellow);
    }

    @Test
    public void whenColorFactoryInvokedWithUnknownParam_thenThrowException() {
        AbstractFactory<Animal> colorFac = FactoryProvider.getFactory(FactoryProvider.FactoryTypes.Color.name());

        assertThrows(IllegalArgumentException.class, () -> {
            colorFac.create("unkown");
        });
    }
}
