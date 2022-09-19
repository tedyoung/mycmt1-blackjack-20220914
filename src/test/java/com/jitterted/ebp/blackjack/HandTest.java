package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class HandTest {

    @Test
    void handWithCardsValuedAt22IsBusted() {
        Hand hand = HandFactory.createHandWithRanksOf("8", "8", "6");

        assertThat(hand.isBusted())
                .isTrue();
    }

    @Test
    public void handWithCardsValuedAt21IsNotBusted() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("8", "8", "5");

        assertThat(hand.isBusted())
                .isFalse();
    }

    @Test
    public void handWithCardsValuedAt20IsNotBusted() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("Q", "J");

        assertThat(hand.isBusted())
                .isFalse();
    }

}