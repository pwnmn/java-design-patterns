package com.github.pwnmn.design_patterns.creational.factory_method;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactoryMethodTest {

    @Test
    public void whenCreatePlanWithFactory_thenReturnCorrectType() {
        var planFactory = new PlanFactory();
        var instPlan = planFactory.getPlan(PlanFactory.PlanType.INSTITUTIONAL);
        var commPlan = planFactory.getPlan(PlanFactory.PlanType.COMMERCIAL);
        var domPlan = planFactory.getPlan(PlanFactory.PlanType.DOMESTIC);

        assertEquals(true, instPlan instanceof InstitutionalPlan);
        assertEquals(true, commPlan instanceof CommercialPlan);
        assertEquals(true, domPlan instanceof DomesticPlan);

    }
}
