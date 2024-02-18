package org.project;

public class OutputWriter {
    static String writeSubject(Subject subject) {
        StringBuilder sb = new StringBuilder();
        sb.append("Subject: ").append(subject.name()).append('\t');
        sb.append("Max Mark: ").append(subject.fullMark()).append('\n');
        return sb.toString();
    }

    static String writeStudentHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student name").append('\t');
        sb.append("Student number").append('\t');
        sb.append("GPA").append('\t');
        sb.append("Grade").append('\n');
        return sb.toString();
    }

    static String writeStudent(Student student) {
        StringBuilder sb = new StringBuilder();
        sb.append(student.name()).append('\t');
        sb.append(student.id()).append('\t');
        sb.append(student.GPA()).append('\t');
        sb.append(student.grade()).append('\n');
        return sb.toString();
    }
}
