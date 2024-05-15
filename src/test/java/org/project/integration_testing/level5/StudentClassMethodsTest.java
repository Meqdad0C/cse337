package org.project.integration_testing.level5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.Student;

public class StudentClassMethodsTest {
    /*          totalMark          */
    //this is leaf node therefore these tests are unit testing not integration
    @Test
    void Test1_TotalMark(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "5";
        String oral_mark = "3";
        String midterm_mark = "14";
        String final_mark = "15";

        int expected =15+3+14+5;
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);
        Assertions.assertEquals(expected,st.totalMark());

    }

    @Test
    void Test2_TotalMarks_allZero(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "0";
        String oral_mark = "0";
        String midterm_mark = "0";
        String final_mark = "0";

        int expected =0;
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);
        Assertions.assertEquals(expected,st.totalMark());

    }
    @Test
    void Test3_TotalMarks_maxGrade(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "60";

        int expected =100;
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);
        Assertions.assertEquals(expected,st.totalMark());

    }
}
