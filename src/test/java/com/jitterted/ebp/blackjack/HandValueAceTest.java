package com.jitterted.ebp.blackjack;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class HandValueAceTest {

    private static final Suit DUMMY_SUIT = Suit.CLUBS;

    // FIRST: fast, isolated, repeatable, self-validating, timely

    @Test
    public void handWithOneAceTwoCardsIsValuedAt11() throws Exception {
        Hand hand = createHandWithRanksOf("A", "5");

        assertThat(hand.value())
                .isEqualTo(11 + 5);
    }

    @Test
    public void handWithOneAceAndOtherCardsEqualTo11IsValuedAt1() throws Exception {
        Hand hand = createHandWithRanksOf("A", "8", "3");

        assertThat(hand.value())
                .isEqualTo(1 + 8 + 3);
    }

    private Hand createHandWithRanksOf(String... ranks) {
        List<Card> cards = Arrays.stream(ranks)
                                 .map(rank -> new Card(DUMMY_SUIT, rank))
                                 .collect(Collectors.toList());

        return Hand.handWithCardsForTesting(cards);
    }

}
