package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0;

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireNotNegativeAmount(amount);
        balance += amount;
    }

    public int balance() {
        return balance;
    }

    private void requireNotNegativeAmount(int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
    }
}
