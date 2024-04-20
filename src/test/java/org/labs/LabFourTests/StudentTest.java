package org.labs.LabFourTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.labs.Four.Student;

public class StudentTest {

    @Test
    void Testing_Without_equals_Override(){

        Student student1= new Student("Meqdad",22);
        Student student2= new Student("Abdelrahman",22);

        Assertions.assertEquals(student1.getAge(),student2.getAge());
    }

    @Test
    void Testing_equals_Override_DifferentObjects(){

        Student student1= new Student("Abdelrahman",22);
        Student student2= new Student("Abdelrahman",22);

        Assertions.assertEquals(student1,student2);
    }

    @Test
    void Testing_equals_Override_SameObject(){

        Student student1= new Student("Abdelrahman",22);
        Student student2= student1;

        Assertions.assertEquals(student1,student2);
    }

    @Test
    public void TestAssertSame(){

        Student studentA= new Student("Abdelmagid",22);
        Student studentB = studentA;

        Assertions.assertSame(studentA,studentB,"Should be Same object");
    }

    @Test
    public void TestAssertNotSame(){

        Student studentA= new Student("Abdelrahman",22);
        Student studentB = new Student("Abdelrahman",22);

        Assertions.assertNotSame(studentA,studentB,"Shouldn't be Same object");
    }

    @Test
    public void TestGetName(){
        Student studentA= new Student("Youssef",22);

        String expected = "Youssef";

        Assertions.assertEquals(expected, studentA.getName());

    }

    @Test
    public void TestGetAge(){

        Student studentA= new Student("Youssef",22);

        int expected = 22;

        Assertions.assertEquals(expected, studentA.getAge());

    }

}
