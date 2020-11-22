package com.github.pwnmn.design_patterns.behavioral.chain_of_responsibility;

class NegativeProcessor extends Processor
{  
    public NegativeProcessor(Processor processor){ 
        super(processor); 
          
    } 
  
    public void process(int request)
    {  
        if (request < 0) {
            System.out.println("NegativeProcessor : " + request);
        }  
        else {
            super.process(request);  
        }  
    }  
} 