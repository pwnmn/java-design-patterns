package com.github.pwnmn.design_patterns.creational.builder;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountBuilderTest {

    @Test
    public void whenBuilderInvoked_thenReturnCorrectResult() {
        BankAccount account = BankAccount.builder()
                .accountNumber("123").balance(10)
                .branch("11").interestRate(1.5).build();

        assertEquals("123", account.getAccountNumber());
        assertEquals(10, account.getBalance());
        assertEquals("11", account.getBranch());
        assertEquals(1.5, account.getInterestRate());
    }
}
