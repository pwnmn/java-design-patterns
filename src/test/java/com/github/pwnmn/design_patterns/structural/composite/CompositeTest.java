package com.github.pwnmn.design_patterns.structural.composite;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CompositeTest {

    @Test
    public void whenCreateDepartments_thenPrintCorrectNames() {
        Branch salesDepartment = new DevelopmentBranch(1, "Sales department");
        Branch financialDepartment = new SalesBranch(2, "Financial department");
        Branch marketingBranch = new MarketingBranch(3, "Marketing department");

        HeadBranch headDepartment = new HeadBranch(
                4, "Head branch");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);
        headDepartment.addDepartment(marketingBranch);

        assertEquals("DevelopmentBranch SalesBranch MarketingBranch", headDepartment.getBranchName());
    }
}
