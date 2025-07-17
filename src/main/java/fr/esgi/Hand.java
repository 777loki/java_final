package fr.esgi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    private List<String> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public Hand(String... cards) {
        this.cards = new ArrayList<>(Arrays.asList(cards));
    }

    public int lenght() {
        return this.cards.size();
    }
}
