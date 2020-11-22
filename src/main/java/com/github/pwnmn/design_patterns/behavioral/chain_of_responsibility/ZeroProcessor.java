package com.github.pwnmn.design_patterns.behavioral.chain_of_responsibility;

class ZeroProcessor extends Processor
{  
    public ZeroProcessor(Processor processor){ 
        super(processor); 
    } 
  
    public void process(int request)
    {  
        if (request == 0)
        {  
            System.out.println("ZeroProcessor : " + request);
        }  
        else
        {  
            super.process(request);  
        }  
    }  
}