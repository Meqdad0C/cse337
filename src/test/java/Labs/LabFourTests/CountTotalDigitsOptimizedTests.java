package Labs.LabFourTests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.labs.Four.CountTotalDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
public class CountTotalDigitsOptimizedTests {

    private ByteArrayInputStream bais;
    private ByteArrayOutputStream baos;
    private  PrintStream printStream;
    private String input;
    private String actual;
    private String expected;

    @BeforeEach
    void setUp(){
        baos = new ByteArrayOutputStream();
        printStream = new PrintStream(baos);
        System.setOut(printStream);
    }

    @Test
    void valid_LargeNumber()
    {
        input = "123456789";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        String[] lines = baos.toString().split(System.lineSeparator());
        actual = lines[lines.length-1];
        expected = "9";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with large number");
    }

    @Test
    void valid_SmallNumber() {

        input = "31";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "2";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with small number");
    }

    @Test
    void TestingZero() {

        input = "0";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "0";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with Zero");
    }

    @Test
    void TestingNegativeValue() {

        input = "-256156156";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "9";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with LargeNegative");
    }

    @Test
    void TestingNegativeZero() {

        input = "-0";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "0";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with -Zero");
    }

    @Test
    void TestingSameDigit(){

        input = "111111111";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "9";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with same digit");

    }

    @Test
    void TestingInvalidInput(){
        input = "ABC";

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "0";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with invalid input");
    }

    @Test
    void TestingVeryLargeNumber(){
        input = String.valueOf(Long.MAX_VALUE);

        bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        CountTotalDigits.main(null);

        actual = baos.toString();
        expected = "19";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with Very large number");
    }
    @AfterEach
    void tearDown(){
        baos = null;
        bais = null;
        printStream = null;
    }
}
