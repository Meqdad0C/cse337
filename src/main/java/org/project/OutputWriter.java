package org.project;

public class OutputWriter {
    static String writeSubject(Subject subject) {
        String string = "Subject: " + subject.name() + '\t' +
                "Max Mark: " + subject.fullMark() + '\n';
        return string;
    }

    static String writeStudentHeader() {
        String string = "Student name" + '\t' +
                "Student number" + '\t' +
                "GPA" + '\t' +
                "Grade" + '\n';
        return string;
    }

    static String writeStudent(Student student) {
        String string = student.name() + '\t' +
                student.id() + '\t' +
                student.GPA() + '\t' +
                student.grade() + '\n';
        return string;
    }
}
