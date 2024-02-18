package org.project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        int argc = args.length;
        if (argc != 2) {
            System.out.println("Usage: java InputParser <input-file> <output-file>");
            return;
        }
        String input = args[0];
        List<String> lines = Files.readAllLines(Path.of(input));
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
        try {
            Files.writeString(Path.of(args[1]), output);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
