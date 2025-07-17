package fr.esgi;

public class Card {

    private final String card;

    public Card(String card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return card;
    }
}
