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
        try {
            String input_file = args[0];
            FileReader fileReader = new FileReader(input_file);
            lines = fileReader.read_file_lines();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Processing the content of the file
        StringBuilder output = new StringBuilder();
        try {
            Subject subject = InputParser.parseSubject(lines.removeFirst());
            output.append(OutputWriter.writeSubject(subject));
            output.append(OutputWriter.writeStudentHeader());
            List<Student> students = lines.stream().map(InputParser::parseStudent).toList();
            students.forEach(student -> output.append(OutputWriter.writeStudent(student)));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        // Writing new content to an output file
        try {
            String output_file = args[0];
            FileWriter fileWriter = new FileWriter(output_file);
            fileWriter.write_file_lines(output);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
