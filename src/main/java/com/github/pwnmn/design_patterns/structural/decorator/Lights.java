package com.github.pwnmn.design_patterns.structural.decorator;

public class Lights extends TreeDecorator {

    public Lights(ChristmasTree tree) {
        super(tree);
    }

    public String decorate() {
        return super.decorate() + decorateWithLights();
    }

    private String decorateWithLights() {
        return " with lights";
    }
}
