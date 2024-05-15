package org.project.integration_testing.level3;

import org.junit.jupiter.api.Test;
import org.project.OutputWriter;
import org.project.Student;
import org.project.Subject;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OutputWriterClassMethodsTest {
    /*          writeSubject          */
    @Test
    void test_writeSubject_validSubject() {
        String expected = "Subject: Software Testing\tMax Mark: 100\n";
        String name = "Software Testing",code = "CSE337", fullMark = "100";
        Subject subject = new Subject(name,code, fullMark);
        String actual = OutputWriter.writeSubject(subject);
        assertEquals(expected, actual);
    }



    /*          writeStudentHeader          */
    @Test
    void test_writeStudentHeader() {
        String expected = "Student name\tStudent number\tGPA\tGrade\n";
        String actual = OutputWriter.writeStudentHeader();
        assertEquals(expected, actual);
    }



    /*          writeStudent          */
    @Test
    void test_writeStudent_validStudent() {
        String expected = "Meqdad Amr Shawky\t19016640\t2.0\tC\n";
        String name = "Meqdad Amr Shawky", id = "19016640", activity_mark = "10", oral_mark = "10", midterm_mark = "20", final_mark = "30";
        Student student = new Student(name, id, activity_mark, oral_mark, midterm_mark, final_mark);
        String actual = OutputWriter.writeStudent(student);
        assertEquals(expected, actual);
    }

}
