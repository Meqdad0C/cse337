package org.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReader {

    private final String input_file_name;
    public FileReader(String input_file_name) {
        this.input_file_name = input_file_name;
    }

    public List<String> read_file_lines() throws IOException {
        return Files.readAllLines(Path.of(input_file_name));
    }


}
