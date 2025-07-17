package fr.esgi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CardTest {

    @Test
    public void shouldCreateCard() {
        Card card = new Card("A♠");
        assertEquals("A♠", card.toString());
    }

}
