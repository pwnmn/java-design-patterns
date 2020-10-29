package com.github.pwnmn.design_patterns.structural.adapter;

/**
 * Adapter connects between to incompatible interfaces. (Weighable & WeighableAdapter)
 */
public class WeighableAdapterImpl implements WeighableAdapter {
    private Weighable sackOfPotatoes;

    public WeighableAdapterImpl(Weighable weighable) {
        this.sackOfPotatoes = weighable;
    }

    @Override
    public double weight() {
        return convertPoundsToKilogram(sackOfPotatoes.weight());
    }

    private double convertPoundsToKilogram(double pounds) {
        return pounds * 0.45359237;
    }
}
