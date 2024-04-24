package org.labs.Five.Top_Down;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.labs.Five.BlackCoffee;
import org.labs.Five.CoffeeMachine;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class BlackCoffeeTest {

    private CoffeeMachine coffeeMachine;
    private BlackCoffee blackCoffee;

    @BeforeEach
    void setUp() {
        coffeeMachine = spy(CoffeeMachine.class);
        blackCoffee = new BlackCoffee(coffeeMachine);
    }

    @Test
    void testBlackCoffeeMakeSuccess() {
        when(coffeeMachine.getCoffee_powder()).thenReturn(40.0);
        when(coffeeMachine.getWater()).thenReturn(1.8);

        blackCoffee.BlackCoffeeMake();

        assertEquals(40, coffeeMachine.getCoffee_powder(), "Should have 40 grams of coffee powder left.");
        assertEquals(1.8, coffeeMachine.getWater(), "Should have 1.8 liters of water left.");
        assertEquals(1, coffeeMachine.getCoffee_Count(), "Should have made 1 coffee.");
    }

    @Test
    void testBlackCoffeeMakeFail() {
        when(coffeeMachine.getCoffee_powder()).thenReturn(5.0);
        when(coffeeMachine.getWater()).thenReturn(0.1);
        when(coffeeMachine.getCoffee_Count()).thenReturn(0);

        blackCoffee.BlackCoffeeMake();

        assertEquals(5, coffeeMachine.getCoffee_powder(), "Coffee powder should remain unchanged.");
        assertEquals(0.1, coffeeMachine.getWater(), "Water should remain unchanged.");
        assertEquals(0, coffeeMachine.getCoffee_Count(), "No coffee should have been made.");
    }
}
