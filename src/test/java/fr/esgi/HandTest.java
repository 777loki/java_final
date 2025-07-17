package fr.esgi;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;


public class HandTest {

    @Test
    public void shouldCreateEmptyHand() {
        Hand hand = new Hand();
        assertEquals(0, hand.lenght());
    }

    @Test
    public void shouldCreateHandWithString(){
        Hand hand = new Hand("A♥","10♦","Q♣","J♥");
        assertNotNull(hand);
        assertEquals(4, hand.lenght());
    }
}
