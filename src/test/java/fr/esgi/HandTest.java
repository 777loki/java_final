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

}
