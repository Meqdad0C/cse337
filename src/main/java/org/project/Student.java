package org.project;

record Student(String name, String id, String activity_mark, String oral_mark, String midterm_mark, String final_mark) {
    int totalMark() {
        return Integer.parseInt(activity_mark) + Integer.parseInt(oral_mark) + Integer.parseInt(midterm_mark) + Integer.parseInt(final_mark);
    }

    String grade() {
        return GpaHelper.getGrade(totalMark());
    }

    String GPA() {
        return GpaHelper.getGrade(totalMark());
    }
}
