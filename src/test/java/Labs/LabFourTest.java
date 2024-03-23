package Labs;

import org.labs.Four.Main;
import org.labs.Four.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class LabFourTest {

    private ByteArrayInputStream bais;
    private ByteArrayOutputStream baos;
    private String input;


    @BeforeEach
    void InitEach(){
        baos=new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);
    }

    @Test
    void Test1() {

//        int input = 31;
        String expected = "2";
        String input = "31";
        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(baos);
//        System.setOut(printStream);

        Main.main(null);
        Assertions.assertEquals(expected, baos.toString(), "Megz is the Best");
    }

    @Test
    void TestingZero() {

//        int input = 31;
        String expected = "0";
        String input = "0";
        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(baos);
//        System.setOut(printStream);

        Main.main(null);
        Assertions.assertEquals(expected, baos.toString(), "SHOULD BE ZERO");
    }

    @Test
    void TestingLargeValue() {

        String expected = "9";
        String input = "256156156";
        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(baos);
//        System.setOut(printStream);

        Main.main(null);
        Assertions.assertEquals(expected, baos.toString());
    }

    @Test
    void TestingNegativeValue() {

        String expected = "9";
        String input = "-256156156";
        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(baos);
//        System.setOut(printStream);

        Main.main(null);
        Assertions.assertEquals(expected, baos.toString());
    }

    @Test
    void TestingNegativeZero() {

        String expected = "0";
        String input = "-0";
        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(baos);
//        System.setOut(printStream);

        Main.main(null);
        Assertions.assertEquals(expected, baos.toString());
    }

    @Test
    void TestingStudent(){
        Student student1= new Student("Meqdad",22);
        Student student2= new Student("Abdelrahman",22);

        Assertions.assertEquals(student1.getAge(),student2.getAge());
    }

    @Test
    public void testAssertSame(){

        Student studentA= new Student("Abdelrahman",22);

        Student studentB=studentA;
        Assertions.assertSame(studentA,studentB);
    }
}
