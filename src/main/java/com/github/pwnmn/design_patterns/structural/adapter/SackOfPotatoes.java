package com.github.pwnmn.design_patterns.structural.adapter;

/**
 * Implementation of the Weighable interface for a sack of potatoes
 */
public class SackOfPotatoes implements Weighable {

    private final double weight;

    public SackOfPotatoes(double weight) {
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }
}
