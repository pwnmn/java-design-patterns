package com.github.pwnmn.design_patterns.creational.factory_method;

/**
 * Institutional plan implementation
 */
public class InstitutionalPlan extends Plan {
    public InstitutionalPlan() {
        this.rate = 3;
    }

    @Override
    int getRate() {
        return rate;
    }
}
