package org.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    static Object[] read_file_lines(List<String> lines) {
        Subject subject = InputParser.parseSubject(lines.removeFirst());
        List<Student> students = lines.stream().map(InputParser::parseStudent).toList();

        return new Object[] { subject, students };
    }

    static StringBuilder write_file_lines(Subject subject, List<Student> students) {
        StringBuilder output_string = new StringBuilder();
        output_string.append(OutputWriter.writeSubject(subject));
        output_string.append(OutputWriter.writeStudentHeader());
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
        String input_file = args[0];
        String output_file = args[1];

        List<String> lines = new FileReader(input_file).read_file_lines();
        try {
            var result = read_file_lines(lines);
            Subject subject = (Subject) result[0];
            List<Student> students = (List<Student>) result[1];

            var file_str = write_file_lines(subject, students);
            // Writing new content to an output file
            new FileWriter(output_file).write_file_lines(file_str);

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
