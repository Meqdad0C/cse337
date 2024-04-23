package org.labs.Five;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;

class MainClassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testMainWithYesInput() {
        String input = "Y\n6\n"; // Assuming '6' is the command to exit in MakeCoffee
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{}); // Call the main method which should read 'Y' and proceed

        // Check if the appropriate messages are displayed and that the machine starts
        assertTrue(outContent.toString().contains("Wants to Start Mechine Y or N ?"));
        assertTrue(outContent.toString().contains("Shutting Down..."));
    }
    @Test
    void testMainWithSmallYInput() {
        String input = "y\n6\n"; // Assuming '6' is the command to exit in MakeCoffee
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{}); // Call the main method which should read 'Y' and proceed

        // Check if the appropriate messages are displayed and that the machine starts
        assertTrue(outContent.toString().contains("Wants to Start Mechine Y or N ?"));
        assertTrue(outContent.toString().contains("Shutting Down..."));
    }

    @Test
    void testMainWithNoInput() {
        String input = "N\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Main.main(new String[]{}); // Call the main method which should read 'N' and exit

        // Check if the appropriate messages are displayed and that the machine does not start
        assertTrue(outContent.toString().contains("Wants to Start Mechine Y or N ?"));
        assertTrue(outContent.toString().contains("Shutting Down..."));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
