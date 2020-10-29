package com.github.pwnmn.design_patterns.creational.factory_method;

/**
 * Abstract class defining a plan. Rate will be implemented in the subclasses.
 */
public abstract class Plan {
    protected int rate;

    abstract int getRate();

    public int calculateRate(int units) {
        return rate * units;
    }

}
