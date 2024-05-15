package org.project.integration_testing.level2;

import org.junit.jupiter.api.Test;
import org.project.FileWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileWriterClassMethodTest {
    @Test
    void test1_writeString() throws IOException {
        String file_name = "output.txt";
        FileWriter fileWriter = new FileWriter(file_name);

        StringBuilder s = new StringBuilder("Test String");
        fileWriter.write_file_lines(s);

        List<String> strings =  Files.readAllLines(Path.of(file_name));

        assertEquals(1,strings.size());
        assertEquals(String.valueOf(s), strings.get(0));
    }
    @Test
    void test2_writeEmptyString() throws IOException {
        String file_name = "output.txt";
        FileWriter fileWriter = new FileWriter(file_name);

        StringBuilder s = new StringBuilder("");
        fileWriter.write_file_lines(s);

        List<String> strings =  Files.readAllLines(Path.of(file_name));

        assertEquals(0,strings.size());
    }
    @Test
    void test3_writeMultLines() throws IOException {
        String file_name = "output.txt";
        FileWriter fileWriter = new FileWriter(file_name);

        StringBuilder s = new StringBuilder("Youssef\nSalah");
        fileWriter.write_file_lines(s);

        List<String> strings =  Files.readAllLines(Path.of(file_name));

        assertEquals(2,strings.size());
        assertEquals("Youssef", strings.get(0));
        assertEquals("Salah", strings.get(1));
    }
}
