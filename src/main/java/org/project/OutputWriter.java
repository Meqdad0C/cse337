package org.project;

public class OutputWriter {
    public static String writeSubject(Subject subject) {
        String string = "Subject: " + subject.name() + '\t' +
                "Max Mark: " + subject.fullMark() + '\n';
        return string;
    }

    public static String writeStudentHeader() {
        String string = "Student name" + '\t' +
                "Student number" + '\t' +
                "GPA" + '\t' +
                "Grade" + '\n';
        return string;
    }

    public static String writeStudent(Student student) {
        String string = student.getName() + '\t' +
                student.getId() + '\t' +
                student.GPA() + '\t' +
                student.grade() + '\n';
        return string;
    }
}
