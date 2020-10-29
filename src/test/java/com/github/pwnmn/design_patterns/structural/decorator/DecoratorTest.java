package com.github.pwnmn.design_patterns.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void whenDecoratorsCreated_creationSuccess() {
        ChristmasTree tree = new Garland(new Lights(new ChristmasTreeImpl()));
        assertEquals("Christmas tree with lights with garland", tree.decorate());
    }

}
