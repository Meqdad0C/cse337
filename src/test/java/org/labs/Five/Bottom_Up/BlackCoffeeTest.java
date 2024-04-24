package org.labs.Five.Bottom_Up;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackCoffeeTest_Bottom_Up {

    private MakeCoffeeDriver makeCoffee;  // Using the driver

    @BeforeEach
    void setUp() {
        makeCoffee = new MakeCoffeeDriver();
    }

    @Test
    void testBrewBlackCoffeeSuccess() {
        String result = makeCoffee.brewCoffee("BlackCoffee");
        assertEquals("Mock coffee brewing for BlackCoffee", result);
    }

    @Test
    void testBrewBlackCoffeeFailure() {
        String result = makeCoffee.brewCoffee("WrongType");
        assertEquals("Mock coffee brewing failed", result);
    }
}

// Driver for MakeCoffee
class MakeCoffeeDriver {
    public String brewCoffee(String type) {
        if("BlackCoffee".equals(type)) {
            return "Mock coffee brewing for BlackCoffee";
        } else if ("MilkCoffee".equals(type)){
            return "Mock coffee brewing for MilkCoffee";
        }
            else {
            return "Mock coffee brewing failed";
        }
    }
}
