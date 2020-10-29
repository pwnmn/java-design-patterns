package com.github.pwnmn.design_patterns.creational.factory_method;

/**
 * Commercial plan implementation.
 */
public class CommercialPlan extends Plan {

    public CommercialPlan() {
        this.rate = 2;
    }
    @Override
    int getRate() {
        return rate;
    }
}
