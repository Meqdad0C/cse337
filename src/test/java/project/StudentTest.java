package project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.project.GpaHelper;
import org.project.Student;

//import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StudentTest {
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

//    @Test
//    void Test4_Grade_mock(){
//        String name = "Abdelmagid";
//        String id =  "1111";
//        String activity_mark = "10";
//        String oral_mark = "10";
//        String midterm_mark = "20";
//        String final_mark = "60";
//        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);
//        GpaHelper gp = mock(GpaHelper.class);
//        when(gp.getGrade(100)).thenReturn("A_PLUS");
//        Assertions.assertEquals("A+",st.grade());
//    }
    @Test
    void Test5_Grade_FullMark(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "60";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("A+",st.grade());

    }
    @Test
    void Test5_Grade_A_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "59";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("A+",st.grade());

    }
    @Test
    void Test5_Grade_A(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "9";
        String oral_mark = "9";
        String midterm_mark = "19";
        String final_mark = "59";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("A",st.grade());

    }
    @Test
    void Test5_Grade_A_MINUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "0";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "60";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("A-",st.grade());

    }
    @Test
    void Test5_Grade_B_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "9";
        String midterm_mark = "19";
        String final_mark = "50";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("B+",st.grade());

    }

    @Test
    void Test5_Grade_B(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "5";
        String midterm_mark = "15";
        String final_mark = "50";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("B",st.grade());

    }
    @Test
    void Test5_Grade_B_MINUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "5";
        String oral_mark = "5";
        String midterm_mark = "19";
        String final_mark = "50";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("B-",st.grade());

    }

    @Test
    void Test5_Grade_C_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "35";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("C+",st.grade());

    }
    @Test
    void Test5_Grade_C(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "30";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("C",st.grade());

    }

    @Test
    void Test5_Grade_C_MINUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "15";
        String final_mark = "32";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("C-",st.grade());

    }
    @Test
    void Test5_Grade_D_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "24";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("D+",st.grade());

    }

    @Test
    void Test5_Grade_D(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "0";
        String oral_mark = "5";
        String midterm_mark = "0";
        String final_mark = "55";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("D",st.grade());

    }

    @Test
    void Test5_Grade_F(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "5";
        String oral_mark = "0";
        String midterm_mark = "0";
        String final_mark = "30";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("F",st.grade());

    }

    @Test
    void Test6_GPA_FullMark(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "60";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals(4,st.GPA());

    }

    @Test
    void Test6_GPA_A_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "59";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals(4,st.GPA());

    }
    @Test
    void Test6_GPA_A(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "9";
        String oral_mark = "9";
        String midterm_mark = "19";
        String final_mark = "59";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("4",st.GPA());

    }
    @Test
    void Test6_GPA_A_MINUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "0";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "60";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("3.7",st.GPA());

    }
    @Test
    void Test6_GPA_B_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "9";
        String midterm_mark = "19";
        String final_mark = "50";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("3.3",st.GPA());

    }

    @Test
    void Test6_GPA_B(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "5";
        String midterm_mark = "15";
        String final_mark = "50";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("3",st.GPA());

    }
    @Test
    void Test6_GPA_B_MINUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "5";
        String oral_mark = "5";
        String midterm_mark = "19";
        String final_mark = "50";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("2.7",st.GPA());

    }

    @Test
    void Test6_GPA_C_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "35";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("2.3",st.GPA());

    }
    @Test
    void Test6_GPA_C(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "30";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("2",st.GPA());

    }

    @Test
    void Test6_GPA_C_MINUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "15";
        String final_mark = "32";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("1.7",st.GPA());

    }
    @Test
    void Test6_GPA_D_PLUS(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "10";
        String oral_mark = "10";
        String midterm_mark = "20";
        String final_mark = "24";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("1.3",st.GPA());

    }

    @Test
    void Test6_GPA_D(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "0";
        String oral_mark = "5";
        String midterm_mark = "0";
        String final_mark = "55";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("1",st.GPA());

    }

    @Test
    void Test6_GPA_F(){
        String name = "Abdelmagid";
        String id =  "1111";
        String activity_mark = "5";
        String oral_mark = "0";
        String midterm_mark = "0";
        String final_mark = "30";
        Student st= new Student(name,id,activity_mark,oral_mark,midterm_mark,final_mark);

        Assertions.assertEquals("0",st.GPA());


    }
}
