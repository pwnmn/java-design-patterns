package com.github.pwnmn.design_patterns.creational.builder;

/**
 * Builder pattern example using a bank account. (Don't use double for currency in real projects)
 */
public class BankAccount {
    private String accountNumber;
    private String owner;
    private String branch;
    private double interestRate;
    private double balance;

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String accountNumber;
        private String owner;
        private String branch;
        private double interestRate;
        private double balance;

        public Builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder interestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public BankAccount build() {
            var bankAccount = new BankAccount();
            bankAccount.accountNumber = this.accountNumber;
            bankAccount.balance = this.balance;
            bankAccount.owner = this.owner;
            bankAccount.branch = this.branch;
            bankAccount.interestRate = this.interestRate;

            return bankAccount;
        }
    }

    private BankAccount() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }
}
