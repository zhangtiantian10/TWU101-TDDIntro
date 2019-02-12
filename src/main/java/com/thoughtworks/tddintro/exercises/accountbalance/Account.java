package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int money;

    public Account() {}

    public Account(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int deposit(int money) {
        this.money = this.money + money;
        return this.money;
    }

    public int withdraw(int money) {
        if (money > this.money) {
            return this.money;
        }
        this.money = this.money - money;
        return this.money;
    }
}
