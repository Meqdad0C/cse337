package org.labs.LabFourTests;

import org.labs.Four.CountTotalDigits;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class CountTotalDigitsTrivialTests {

    @Test
    void valid_LargeNumber()
    {
        String number_to_test = "123456789";

        ByteArrayInputStream bais = new ByteArrayInputStream(number_to_test.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        System.setOut(ps);

        CountTotalDigits.main(null);

        String[] lines = baos.toString().split(System.lineSeparator());
        String actual = lines[lines.length-1];
        String expected = "9";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with large number");
    }

    @Test
    void valid_SmallNumber() {

        String input = "31";

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "2";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with small number");
    }

    @Test
    void TestingZero() {

        String input = "0";

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "0";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with Zero");
    }

    @Test
    void TestingNegativeValue() {

        String input = "-256156156";

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "9";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with LargeNegative");
    }

    @Test
    void TestingNegativeZero() {

        String input = "-0";

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "0";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with -Zero");
    }

    @Test
    void TestingSameDigit(){
        String input = "111111111";

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "9";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with same digits");
    }

    @Test
    void TestingVeryLargeNumber(){

        String input = String.valueOf(Long.MAX_VALUE);

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "19";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with Very large number");

    }

    @Test
    void TestingInvalidInput(){
        String input = "ABC";

        InputStream bais = new ByteArrayInputStream(input.getBytes());
        System.setIn(bais);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(baos);
        System.setOut(printStream);

        CountTotalDigits.main(null);

        String actual = baos.toString();
        String expected = "0";

        Assertions.assertEquals(expected, actual, "Error in CountTotalDigits with invalid input");
    }
}
