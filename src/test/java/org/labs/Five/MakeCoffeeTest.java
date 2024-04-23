package org.labs.Five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.util.Scanner;

class MakeCoffeeTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    private CoffeeMachine coffeeMachine;
    private MakeCoffee makeCoffee;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outContent));
        coffeeMachine = new CoffeeMachine();
        coffeeMachine.SetIngredient(); // Fill the ingredients initially
    }

    @Test
    void testCheckIngredients() {
        String input = "1\n6\n"; // Option 1 then exit
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        makeCoffee = new MakeCoffee(coffeeMachine, new Scanner(System.in));
        makeCoffee.start();

        assertTrue(outContent.toString().contains("Available Coffee Power(Gram)"));
        assertTrue(outContent.toString().contains("Available Milk(Liter)"));
        assertTrue(outContent.toString().contains("Available Water(Liter)"));
    }

    @Test
    void testFillIngredients() {
        // Assume the ingredients are depleted
        coffeeMachine.setCoffee_powder(0);
        coffeeMachine.setMilk(0);
        coffeeMachine.setWater(0);

        String input = "2\n1\n6\n"; // Fill then check status and exit
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        makeCoffee = new MakeCoffee(coffeeMachine, new Scanner(System.in));
        makeCoffee.start();

        assertTrue(outContent.toString().contains("Filling Completed."));
        assertTrue(outContent.toString().contains("500.0")); // Check if the coffee powder is refilled
    }

    @Test
    void testCoffeeCount() {
        coffeeMachine.setCoffee_Count(5); // Set manually for testing

        String input = "5\n6\n"; // Option to check how many coffees have been made then exit
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        makeCoffee = new MakeCoffee(coffeeMachine, new Scanner(System.in));
        makeCoffee.start();

        assertTrue(outContent.toString().contains("We Have Made 5 Coffees."));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
