package org.project;

public enum Grade {
    A_PLUS("A+"), A("A"), A_MINUS("A-"),
    B_PLUS("B+"), B("B"), B_MINUS("B-"),
    C_PLUS("C+"), C("C"), C_MINUS("C-"),
    D_PLUS("D+"), D("D"),
    F("F");

    private final String grade;

    Grade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return grade;
    }
}
