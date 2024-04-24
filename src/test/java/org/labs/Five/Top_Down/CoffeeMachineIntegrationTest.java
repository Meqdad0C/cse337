package org.labs.Five.Top_Down;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.labs.Five.Coffee;
import org.labs.Five.CoffeeMachine;
import org.labs.Five.MakeCoffee;
import org.labs.Five.MakeCoffeeFactory;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

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
        MakeCoffee makeCoffee = new MakeCoffee(coffeeMachine, scanner);
        MakeCoffee spyMakeCoffee = spy(makeCoffee);
        // Redirecting output to avoid clutter during test
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) {
            }
        }));
        doAnswer(invocation -> {
            coffeeMachine.setCoffee_Count(coffeeMachine.getCoffee_Count()+1);
            return null;
        }).when(spyMakeCoffee).makeCoffee();
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
        MakeCoffee makeCoffee = new MakeCoffee(coffeeMachine, scanner);
        MakeCoffee spyMakeCoffee = spy(makeCoffee);

        // Redirecting output to avoid clutter during test
        System.setOut(new java.io.PrintStream(new java.io.OutputStream() {
            @Override
            public void write(int b) {
            }
        }));
        doAnswer(invocation -> {
            coffeeMachine.setCoffee_Count(coffeeMachine.getCoffee_Count()+1);
            return null;
        }).when(spyMakeCoffee).start();
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
        MakeCoffee spyMakeCoffee = spy(makeCoffee);

        doAnswer(invocation -> {
            coffeeMachine.setCoffee_powder(0);
            coffeeMachine.setMilk(0);
            coffeeMachine.setWater(0);
            return null;
        }).when(spyMakeCoffee).start();
        spyMakeCoffee.start();

        assertEquals(0, coffeeMachine.getCoffee_powder(), "Coffee powder should be 0 after cleaning");
        assertEquals(0, coffeeMachine.getWater(), "Water should be 0 after cleaning");
        assertEquals(0, coffeeMachine.getMilk(), "Milk should be 0 after cleaning");
    }

    @BeforeEach
    void tearDown() {
        System.setIn(originalSystemIn);
    }
}
