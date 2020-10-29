package com.github.pwnmn.design_patterns.creational.factory_method;

/**
 * Domestic plan implementation
 */
public class DomesticPlan extends Plan {

    public DomesticPlan() {
        this.rate = 1;
    }

    @Override
    int getRate() {
        return rate;
    }
}
