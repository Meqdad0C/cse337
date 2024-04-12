package org.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriter {

        private final String output_file_name;
        public FileWriter(String output_file_name) {
            this.output_file_name = output_file_name;
        }

        public void write_file_lines(StringBuilder output) throws IOException {
            Files.writeString(Path.of(output_file_name), output);
        }
}
