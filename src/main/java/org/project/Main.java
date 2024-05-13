package org.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    static StringBuilder parse(List<String> lines) {
        StringBuilder output_string = new StringBuilder();
        Subject subject = InputParser.parseSubject(lines.removeFirst());
        output_string.append(OutputWriter.writeSubject(subject));
        output_string.append(OutputWriter.writeStudentHeader());
        List<Student> students = lines.stream().map(InputParser::parseStudent).toList();
        students.forEach(student -> output_string.append(OutputWriter.writeStudent(student)));
        return output_string;
    }

    public static void main(String[] args) throws IOException {
        int argc = args.length;
        if (argc != 2) {
            System.out.println("Usage: java InputParser <input-file> <output-file>");
            return;
        }
        // Read File Content
        List<String> lines;
        String input_file = args[0];
        FileReader fileReader = new FileReader(input_file);
        lines = fileReader.read_file_lines();

        // Processing the content of the file
        StringBuilder output_string = parse(lines);

        // Writing new content to an output file
        Files.writeString(Path.of(args[1]), output_string);
    }
}
