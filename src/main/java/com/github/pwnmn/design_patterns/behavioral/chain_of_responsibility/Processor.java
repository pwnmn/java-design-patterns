package com.github.pwnmn.design_patterns.behavioral.chain_of_responsibility;

public abstract class Processor {
    private Processor processor;

    public Processor(Processor downstreamProcessor) {
        this.processor = downstreamProcessor;
    }

    public void process(int request) {
        if(processor != null) {
            processor.process(request);
        }
    }
}
