package org.project;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int argc = args.length;
        if (argc != 2) {
            System.out.println("Usage: java InputParser <input-file> <output-file>");
            return;
        }
        // Read File Content
        List<String> lines;
        String input_file = args[0];
        String output_file = args[1];
        FileReader fileReader = new FileReader(input_file);
        FileWriter fileWriter = new FileWriter(output_file);
        lines = fileReader.read_file_lines();

        StringBuilder output_string = new StringBuilder();
        try {
            // Processing the content of the file
            Subject subject = InputParser.parseSubject(lines.removeFirst());
            output_string.append(OutputWriter.writeSubject(subject));
            output_string.append(OutputWriter.writeStudentHeader());
            List<Student> students = lines.stream().map(InputParser::parseStudent).toList();
            students.forEach(student -> output_string.append(OutputWriter.writeStudent(student)));

            // Writing new content to an output file
            fileWriter.write_file_lines(output_string);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
