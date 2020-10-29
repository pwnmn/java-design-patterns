package com.github.pwnmn.design_patterns.structural.composite;

public abstract class AbstractBranch implements Branch {

    private int id;
    private String name;

    public AbstractBranch(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getBranchName() {
        return getClass().getSimpleName();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
