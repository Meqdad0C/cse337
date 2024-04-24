package org.labs.Five.Top_Down;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.labs.Five.CoffeeMachine;
import org.labs.Five.MilkCoffee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

class MilkCoffeeTest {

    private CoffeeMachine coffeeMachine;
    private MilkCoffee milkCoffee;

    @BeforeEach
    void setUp() {
        coffeeMachine = spy(CoffeeMachine.class);
        milkCoffee = new MilkCoffee(coffeeMachine);
    }

    @Test
    void testMilkCoffeeMakeSuccess() {
        // Set up the machine with enough ingredients for at least one milk coffee
//        coffeeMachine.setCoffee_powder(50); // enough for 5 coffees
//        coffeeMachine.setMilk(2); // enough for 5 coffees
//        coffeeMachine.setWater(2); // enough for 10 coffees

        when(coffeeMachine.getCoffee_powder()).thenReturn(40.0);
        when(coffeeMachine.getCoffee_Count()).thenReturn(1);
        when(coffeeMachine.getWater()).thenReturn(1.8);
        when(coffeeMachine.getMilk()).thenReturn(1.6);
        milkCoffee.MilkCoffeeMake();

        assertEquals(40, coffeeMachine.getCoffee_powder(), "Should have 40 grams of coffee powder left.");
        assertEquals(1.6, coffeeMachine.getMilk(), "Should have 1.6 liters of milk left.");
        assertEquals(1.8, coffeeMachine.getWater(), "Should have 1.8 liters of water left.");
        assertEquals(1, coffeeMachine.getCoffee_Count(), "Should have made 1 coffee.");
    }

    @Test
    void testMilkCoffeeMakeFail() {
        // Set up the machine with insufficient ingredients
//        coffeeMachine.setCoffee_powder(5); // not enough for a coffee
//        coffeeMachine.setMilk(0.1); // not enough for a coffee
//        coffeeMachine.setWater(0.1); // not enough for a coffee
        when(coffeeMachine.getCoffee_powder()).thenReturn(5.0);
        when(coffeeMachine.getMilk()).thenReturn(0.1);
        when(coffeeMachine.getWater()).thenReturn(0.1);
        when(coffeeMachine.getCoffee_Count()).thenReturn(0);
        milkCoffee.MilkCoffeeMake();

        assertEquals(5, coffeeMachine.getCoffee_powder(), "Coffee powder should remain unchanged.");
        assertEquals(0.1, coffeeMachine.getMilk(), "Milk should remain unchanged.");
        assertEquals(0.1, coffeeMachine.getWater(), "Water should remain unchanged.");
        assertEquals(0, coffeeMachine.getCoffee_Count(), "No coffee should have been made.");
    }
}
