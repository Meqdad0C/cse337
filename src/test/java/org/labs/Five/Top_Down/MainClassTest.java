package org.labs.Five.Top_Down;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.labs.Five.CoffeeMachine;
import org.labs.Five.Main;
import org.labs.Five.MakeCoffee;
import org.labs.Five.MakeCoffeeFactory;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.InputStream;
import java.util.Scanner;

class MainClassTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }


        @Test
        public void testMainStartsMachine() {
            ByteArrayInputStream in = new ByteArrayInputStream("y\n6\n".getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setIn(in);
            System.setOut(new PrintStream(out));

            CoffeeMachine cm = new CoffeeMachine();
            Scanner scan = new Scanner(System.in);
            MakeCoffee mockMakeCoffee = mock(MakeCoffee.class);
            MakeCoffeeFactory mockFactory = mock(MakeCoffeeFactory.class);
            when(mockFactory.createMakeCoffee(any(), any())).thenReturn(mockMakeCoffee);

            try (MockedStatic<Main> mockedMain = Mockito.mockStatic(Main.class, Mockito.CALLS_REAL_METHODS)) {

                Main.main(new String[]{});  // Run the main method
                mockedMain.verify(() -> Main.callStart(), times(1));

                assertTrue(out.toString().contains("Shutting Down..."));
            }

            // Reset System.in and System.out after test
            System.setIn(System.in);
            System.setOut(System.out);
        }


    @Test
    void testMainWithNoInput() {
        ByteArrayInputStream in = new ByteArrayInputStream("N\n".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));


        MakeCoffee mockMakeCoffee = mock(MakeCoffee.class);
        MakeCoffeeFactory mockFactory = mock(MakeCoffeeFactory.class);
        when(mockFactory.createMakeCoffee(any(), any())).thenReturn(mockMakeCoffee);

        try (MockedStatic<Main> mockedMain = Mockito.mockStatic(Main.class, Mockito.CALLS_REAL_METHODS)) {

            Main.main(new String[]{});  // Run the main method
            mockedMain.verify(() -> Main.callStart(), times(0));

            assertTrue(out.toString().contains("Shutting Down..."));
        }

        // Reset System.in and System.out after test
        System.setIn(System.in);
        System.setOut(System.out);
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}
