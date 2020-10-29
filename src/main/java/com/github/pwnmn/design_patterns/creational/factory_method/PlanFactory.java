package com.github.pwnmn.design_patterns.creational.factory_method;

/**
 * Factory instantiation plans
 */
public class PlanFactory {

    public enum PlanType {
        COMMERCIAL, INSTITUTIONAL, DOMESTIC
    }

    public Plan getPlan(PlanType planType) {
        switch(planType) {
            case DOMESTIC: return new DomesticPlan();
            case COMMERCIAL: return new CommercialPlan();
            case INSTITUTIONAL: return new InstitutionalPlan();
            default:
                throw new IllegalArgumentException("Plan not defined");
        }
    }
}
