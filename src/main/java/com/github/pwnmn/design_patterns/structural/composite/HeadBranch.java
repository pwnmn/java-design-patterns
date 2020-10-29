package com.github.pwnmn.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeadBranch extends AbstractBranch {
    private List<Branch> branches;

    public HeadBranch(int id, String name) {
        super(id, name);
        this.branches = new ArrayList<>();
    }

    @Override
    public String getBranchName() {
        return branches.stream()
                .map(Branch::getBranchName)
                .collect(Collectors.joining(" "));
    }

    public void addDepartment(Branch department) {
        branches.add(department);
    }

    public void removeDepartment(Branch department) {
        branches.remove(department);
    }
}
