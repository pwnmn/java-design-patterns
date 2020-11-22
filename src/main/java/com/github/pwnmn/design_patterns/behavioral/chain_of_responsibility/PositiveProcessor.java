package com.github.pwnmn.design_patterns.behavioral.chain_of_responsibility;

class PositiveProcessor extends Processor
{  
  
    public PositiveProcessor(Processor processor){ 
        super(processor); 
    } 
  
    public void process(int request)
    {  
        if (request > 0) {
            System.out.println("PositiveProcessor : " + request);
        }  
        else {
            super.process(request);  
        }  
    }  
}