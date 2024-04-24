package org.labs.Five.Bottom_Up;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class MakeCoffeeTest_Bottom_Up {


    private CoffeeMachineDriver coffeeMachine;  // Using the updated driver

    @BeforeEach
    void setUp() {
        coffeeMachine = new CoffeeMachineDriver();
    }

    @Test
    void testMakeBlackCoffeeSuccess() {
        String result = coffeeMachine.brew("BlackCoffee");
        assertEquals("Success: Black Coffee brewed", result);
    }

    @Test
    void testMakeMilkCoffeeSuccess() {
        String result = coffeeMachine.brew("MilkCoffee");
        assertEquals("Success: Milk Coffee brewed", result);
    }

    @Test
    void testMakeCoffeeFailure() {
        String result = coffeeMachine.brew("Unknown");
        assertEquals("Failure: Unknown type", result);
    }
}

// Driver for CoffeeMachine
class CoffeeMachineDriver {
    // Simulated responses based on the type of coffee request
    public String brew(String type) {
        switch (type) {
            case "BlackCoffee":
                return "Success: Black Coffee brewed";  // Assume success for simplicity
            case "MilkCoffee":
                return "Success: Milk Coffee brewed";  // Assume success for simplicity
            default:
                return "Failure: Unknown type";        // Simplified error handling
        }
    }
}

