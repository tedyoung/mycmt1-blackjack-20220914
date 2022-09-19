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
    public void handWithOneAceAndOtherCardsEqualTo11AceIsValuedAt1() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "8", "3");

        assertThat(hand.value())
                .isEqualTo(1 + 8 + 3);
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo12AceIsValuedAt1() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "8", "4");

        assertThat(hand.value())
                .isEqualTo(1 + 8 + 4);
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo10AceIsValuedAt11() throws Exception {
        Hand hand = HandFactory.createHandWithRanksOf("A", "8", "2");

        assertThat(hand.value())
                .isEqualTo(11 + 8 + 2); // EVIDENT DATA
    }


}
