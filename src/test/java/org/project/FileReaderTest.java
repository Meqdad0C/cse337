package org.project;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileReaderTest {

    @Test
    void test1_ReadString() throws IOException {
        String file_name = "output.txt";
        StringBuilder s = new StringBuilder("Test String");

        Files.writeString(Path.of(file_name), s);
        FileReader fileReader = new FileReader(file_name);

        List<String> stringList = fileReader.read_file_lines();
        assertEquals(1,stringList.size());
        assertEquals(String.valueOf(s), stringList.get(0));
    }

    @Test
    void test2_ReadMultLines() throws IOException {
        String file_name = "output.txt";
        StringBuilder s = new StringBuilder("Youssef\nSalah");

        Files.writeString(Path.of(file_name), s);
        FileReader fileReader = new FileReader(file_name);

        List<String> stringList = fileReader.read_file_lines();
        assertEquals(2,stringList.size());
        assertEquals("Youssef", stringList.get(0));
        assertEquals("Salah", stringList.get(1));

    }

    @Test
    void test3_readEmpty() throws IOException {
        String file_name = "output.txt";
        StringBuilder s = new StringBuilder("");

        Files.writeString(Path.of(file_name), s);
        FileReader fileReader = new FileReader(file_name);

        List<String> stringList = fileReader.read_file_lines();
        assertEquals(0,stringList.size());


    }

}