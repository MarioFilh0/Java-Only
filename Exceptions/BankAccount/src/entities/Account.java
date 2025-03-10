package entities;

import exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Double balance, String holder, Integer number, Double withdrawLimit) {
        this.balance = balance;
        this.holder = holder;
        this.number = number;
        this.withdrawLimit = withdrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }

    public Account setHolder(String holder) {
        this.holder = holder;
        return this;
    }

    public Integer getNumber() {
        return number;
    }

    public Account setNumber(Integer number) {
        this.number = number;
        return this;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public Account setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
        return this;
    }

    public double deposit(Double amount){
        return balance += amount;
    }

    public void withdraw(Double amount) {
        if(amount > getWithdrawLimit()){
            throw new DomainException("Withdraw error: The amount exceeds withdraw limit.");
        }
        if(amount > getBalance()){
            throw new DomainException("Withdraw error: Not enough balance.");
        }
        balance -= amount;
    }
}
