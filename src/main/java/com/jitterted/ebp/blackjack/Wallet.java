package com.jitterted.ebp.blackjack;

public class Wallet {

    private int balance = 0; // INVARIANT: must never go below 0

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

    public void bet(int betAmount) {
        if (betAmount > balance) {
            throw new IllegalStateException();
        }
        balance -= betAmount;
    }

    private void requireGreaterThanZero(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException();
        }
    }
}
