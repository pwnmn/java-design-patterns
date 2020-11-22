package com.github.pwnmn.design_patterns.behavioral.chain_of_responsibility;

public class Chain extends Processor {

    public Chain() {
        super(new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null))));
    }


}
