package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0;

    public boolean isEmpty() {
        return balance == 0;
    }

    public void addMoney(int amount) {
        requireGreaterThanZero(amount);
        balance += amount;
    }

    public int balance() {
        return balance;
    }

    private void requireGreaterThanZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }

    public void bet(int betAmount) {
        balance -= betAmount;
    }
}
