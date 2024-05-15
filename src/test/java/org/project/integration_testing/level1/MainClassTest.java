package org.project.integration_testing.level1;

import org.junit.jupiter.api.Test;
import org.project.Main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainClassTest {
    private String captureOutput(Runnable task) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        task.run();
        System.setOut(originalOut);
        return baos.toString().trim();
    }

    @Test
    public void testMainWithNoArguments() {
        String[] args = {};
        String output = captureOutput(() -> {
            try {
                Main.main(args);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        assertEquals("Usage: java InputParser <input-file> <output-file>", output);
    }

    @Test
    public void testMainWithArgumentsNotEqual2() {
        String[] args = { "arg1" };
        String output = captureOutput(() -> {
            try {
                Main.main(args);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        assertEquals("Usage: java InputParser <input-file> <output-file>", output);
    }

    @Test
    public void testMainWithTwoArguments() throws IOException {
        // Prepare the environment
        String inputPath = ".\\src\\main\\resources\\sw-testing.csv";
        String outputPath = ".\\src\\main\\resources\\output.csv";
        String expectedPath = ".\\src\\main\\resources\\expected.csv";
        Main.main(new String[] { inputPath, outputPath });

        byte[] fileExpectedBytes = Files.readAllBytes(Paths.get(expectedPath));
        byte[] fileOutputBytes = Files.readAllBytes(Paths.get(outputPath));

        String file1 = new String(fileExpectedBytes, StandardCharsets.UTF_8);
        String file2 = new String(fileOutputBytes, StandardCharsets.UTF_8);

        assertEquals(file1, file2, "The content should match");
    }

    @Test
    public void testMainWithMalfomedInputThrowsException() {
        String[] args = { ".\\src\\main\\resources\\malformed.csv", ".\\src\\main\\resources\\output.csv" };
        assertThrows(Exception.class, () -> Main.main(args));
    }
}
