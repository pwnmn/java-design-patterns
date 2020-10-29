package com.github.pwnmn.design_patterns.creational.factory_abstract.factory;

public interface AbstractFactory<T> {

    T create(String type);
}
