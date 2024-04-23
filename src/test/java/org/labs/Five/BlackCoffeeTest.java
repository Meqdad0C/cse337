package org.labs.Five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BlackCoffeeTest {

    private CoffeeMachine coffeeMachine;
    private BlackCoffee blackCoffee;

    @BeforeEach
    void setUp() {
        coffeeMachine = new CoffeeMachine();
        blackCoffee = new BlackCoffee(coffeeMachine);
    }

    @Test
    void testBlackCoffeeMakeSuccess() {
        coffeeMachine.setCoffee_powder(50); // enough for 5 coffees
        coffeeMachine.setWater(2); // enough for 10 coffees

        blackCoffee.BlackCoffeeMake();

        assertEquals(40, coffeeMachine.getCoffee_powder(), "Should have 40 grams of coffee powder left.");
        assertEquals(1.8, coffeeMachine.getWater(), "Should have 1.8 liters of water left.");
        assertEquals(1, coffeeMachine.getCoffee_Count(), "Should have made 1 coffee.");
    }

    @Test
    void testBlackCoffeeMakeFail() {
        coffeeMachine.setCoffee_powder(5); // not enough for a coffee
        coffeeMachine.setWater(0.1); // not enough for a coffee

        blackCoffee.BlackCoffeeMake();

        assertEquals(5, coffeeMachine.getCoffee_powder(), "Coffee powder should remain unchanged.");
        assertEquals(0.1, coffeeMachine.getWater(), "Water should remain unchanged.");
        assertEquals(0, coffeeMachine.getCoffee_Count(), "No coffee should have been made.");
    }
}
