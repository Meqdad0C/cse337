package org.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OutputWriterTest {

    @Test
    void test_writeSubject_validSubject() {
        String expected = "Subject: Math\tMax Mark: 100\n";

        Subject subject = mock(Subject.class);
        when(subject.name()).thenReturn("Math");
        when(subject.fullMark()).thenReturn("100");

        String actual = OutputWriter.writeSubject(subject);
        assertEquals(expected, actual);
    }

    @Test
    void test_writeStudentHeader() {
        String expected = "Student name\tStudent number\tGPA\tGrade\n";
        String actual = OutputWriter.writeStudentHeader();
        assertEquals(expected, actual);
    }

    @Test
    void test_writeStudent_validStudent() {
        String expected = "Meqdad Amr\t19016640\t3.5\tA\n";

        Student student = mock(Student.class);
        when(student.getName()).thenReturn("Meqdad Amr");
        when(student.getId()).thenReturn("19016640");
        when(student.GPA()).thenReturn(3.5);
        when(student.grade()).thenReturn("A");

        String actual = OutputWriter.writeStudent(student);
        assertEquals(expected, actual);
    }

}
