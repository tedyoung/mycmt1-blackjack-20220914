package com.jitterted.ebp.blackjack;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandFactory {

    static Hand createHandWithRanksOf(String... ranks) {
        List<Card> cards = Arrays.stream(ranks)
                                 .map(rank -> new Card(Suit.HEARTS, rank))
                                 .collect(Collectors.toList());

        return Hand.handWithCardsForTesting(cards);
    }
}
