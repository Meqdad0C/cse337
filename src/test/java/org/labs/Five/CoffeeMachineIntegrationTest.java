package org.labs.Five;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

class CoffeeMachineIntegrationTest {

    private CoffeeMachine coffeeMachine;
    private MakeCoffee makeCoffee;
    private final InputStream originalSystemIn = System.in;

    @BeforeEach
    void setUp() {
        coffeeMachine = new CoffeeMachine();
        coffeeMachine.SetIngredient();
    }

    @Test
    void testMakingBlackCoffee() {
        // Set up input for making black coffee (option 4 then 1)
        ByteArrayInputStream in = new ByteArrayInputStream("4\n1\n6\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        makeCoffee = new MakeCoffee(coffeeMachine, scanner);

        // Redirecting output to avoid clutter during test
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) {
            }
        }));

        makeCoffee.start();

        // Check if a coffee was made
        assertEquals(1, coffeeMachine.getCoffee_Count(), "Should have made 1 black coffee");
    }

    @Test
    void testMakingMilkCoffee() {
        // Set up input for making milk coffee (option 4 then 2)
        ByteArrayInputStream in = new ByteArrayInputStream("4\n2\n6\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        makeCoffee = new MakeCoffee(coffeeMachine, scanner);

        // Redirecting output to avoid clutter during test
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) {
            }
        }));

        makeCoffee.start();

        // Check if a coffee was made
        assertEquals(1, coffeeMachine.getCoffee_Count(), "Should have made 1 milk coffee");
    }

    @Test
    void testCleanMachineFunction() {
        // Test cleaning functionality
        ByteArrayInputStream in = new ByteArrayInputStream("3\n6\n".getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        makeCoffee = new MakeCoffee(coffeeMachine, scanner);

        makeCoffee.start();

        assertEquals(0, coffeeMachine.getCoffee_powder(), "Coffee powder should be 0 after cleaning");
        assertEquals(0, coffeeMachine.getWater(), "Water should be 0 after cleaning");
        assertEquals(0, coffeeMachine.getMilk(), "Milk should be 0 after cleaning");
    }

    @BeforeEach
    void tearDown() {
        System.setIn(originalSystemIn);
    }
}
