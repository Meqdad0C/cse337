package org.labs.Five.Bottom_Up;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.labs.Five.CoffeeMachine;
import org.labs.Five.MilkCoffee;

import static org.junit.jupiter.api.Assertions.*;

class MilkCoffeeTest_Bottom_Up {

    private MakeCoffeeDriver makeCoffee;  // Using the driver

    @BeforeEach
    void setUp() {
        makeCoffee = new MakeCoffeeDriver();
    }

    @Test
    void testBrewMilkCoffeeSuccess() {
        String result = makeCoffee.brewCoffee("MilkCoffee");
        assertEquals("Mock coffee brewing for MilkCoffee", result);
    }

    @Test
    void testBrewMilkCoffeeFailure() {
        String result = makeCoffee.brewCoffee("WrongType");
        assertEquals("Mock coffee brewing failed", result);
    }
}




