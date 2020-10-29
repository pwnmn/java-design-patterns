package com.github.pwnmn.design_patterns.structural.adapter;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    public void whenAdapterInvoked_thenCorrectResultReturned() {
        Weighable sackOfPotatoes = new SackOfPotatoes(10.5);

        WeighableAdapter adapter = new WeighableAdapterImpl(sackOfPotatoes);

        assertEquals(10.5, sackOfPotatoes.weight());
        assertEquals(4.762719885, adapter.weight());
    }
}
