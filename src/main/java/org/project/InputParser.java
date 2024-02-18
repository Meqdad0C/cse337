package org.project;

public class InputParser {

    static Subject parseSubject(String line) throws IllegalArgumentException {
        String[] parts = line.split(",");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input, expected subject name, subject code, and full mark");
        }
        String subjectName = parts[0], subjectCode = parts[1], fullMark = parts[2];
        InputValidator.validateSubject(subjectName, subjectCode, fullMark);
        return new Subject(subjectName, subjectCode, fullMark);
    }

    static Student parseStudent(String line) throws IllegalArgumentException {
        String[] parts = line.split(",");
        if (parts.length != 6) {
            throw new IllegalArgumentException("Invalid input for student, expected student name, student number, student activities mark, oral mark, mid mark, and final mark");
        }
        String studentName = parts[0], studentNumber = parts[1], studentActivitiesMark = parts[2], oralMark = parts[3], midMark = parts[4], finalMark = parts[5];
        InputValidator.validateStudent(studentName, studentNumber, studentActivitiesMark, oralMark, midMark, finalMark);
        return new Student(studentName, studentNumber, studentActivitiesMark, oralMark, midMark, finalMark);
    }

}
