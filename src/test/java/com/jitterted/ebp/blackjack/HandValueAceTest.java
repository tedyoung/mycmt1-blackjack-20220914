package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

    private static final Suit DUMMY_SUIT = Suit.CLUBS;

    // FIRST: fast, isolated, repeatable, self-validating, timely

    @Test
    public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "5");

        assertThat(hand.value())
                .isEqualTo(11 + 5);
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "8", "3");

        assertThat(hand.value())
                .isEqualTo(1 + 8 + 3);
    }


}
