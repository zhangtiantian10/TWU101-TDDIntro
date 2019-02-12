package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);
        assertThat(account.deposit(50), is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account(100);
        assertThat(account.withdraw(50), is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account(50);
        assertThat(account.withdraw(100), is(50));
    }
}
