package org.labs;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.labs.Three.*;

import java.io.IOException;
import java.util.Vector;

public class LabThreeTest {

    @Test
    public void FileHandler_SetFilePath_Test(){
        FileHandler fileHandler = new FileHandler();
        fileHandler.SetFilePath("./src/main/java/org/labs/Three/numbers.txt");

        Assertions.assertEquals("./src/main/java/org/labs/Three/numbers.txt",fileHandler.filePath, "expecting pass");
    }

    @Test
    public void FileHandler_GetData_Test1() throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.filePath = "./src/main/java/org/labs/Three/numbers.txt"; // Change this path according to location of the file
        Vector<Integer> actual = fileHandler.GetData();

        Vector<Integer> expected = new Vector<>();

        expected.add(12);
        expected.add(31);
        expected.add(45);
        expected.add(121);
        expected.add(4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FileHandler_GetData_Test2() throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.filePath = "./src/main/java/org/labs/Three/numbers2.txt"; // Change this path according to location of the file
        Vector<Integer> actual = fileHandler.GetData();

        Vector<Integer> expected = new Vector<>();

        expected.add(12);
        expected.add(31);
        expected.add(45);
        expected.add(121);
        expected.add(4);

        Assertions.assertNotEquals(expected, actual, "expected fail as this file the wrong file" +
                " not the file we want");
    }

    @Test
    public void FileHandler_GetData_Test3() throws IOException {
        FileHandler fileHandler = new FileHandler();
        //this test case to test if case sensitivity is verified or not
        fileHandler.filePath = "./src/main/java/org/labs/Three/Numbers.txt"; // Change this path according to location of the file
        Vector<Integer> actual = fileHandler.GetData();

        Vector<Integer> expected = new Vector<>();

        expected.add(12);
        expected.add(31);
        expected.add(45);
        expected.add(121);
        expected.add(4);

        Assertions.assertEquals(expected, actual, "expected to throw error file not found " +
                "as the expected file is numbers.txt not Numbers.txt");
    }

    @Test
    public void DataAnalyzerTest_GetMin1() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(0);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(0, minValue);
    }

    @Test
    public void DataAnalyzerTest_GetMin2() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(-9);
        numbers.add(1);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(-9, minValue);

    }
	
	
    @Test
    public void DataAnalyzerTest_GetMin3_negatives() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(-2);
        numbers.add(-9);
        numbers.add(-10);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(-10, minValue);

    }

    @Test
    public void DataAnalyzerTest_GetMin4_equal() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(5, minValue);

    }

    @Test
    public void DataAnalyzerTest_GetMin5_zero() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(0, minValue);
    }
    @Test
    public void DataAnalyzerTest_GetMin6_oneElement() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(20);


        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(20, minValue);
    }
    @Test
    public void DataAnalyzerTest_GetMax1_oneElement() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(20);


        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int maxValue =  da.GetMax();
        Assertions.assertEquals(20, maxValue);
    }
    @Test
    public void DataAnalyzerTest_GetMax2() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(6);
        numbers.add(0);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int maxValue =  da.GetMax();
        Assertions.assertEquals(6, maxValue);
    }

    @Test
    public void DataAnalyzerTest_GetMax3() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(-9);
        numbers.add(1);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int maxValue =  da.GetMax();
        Assertions.assertEquals(1, maxValue);

    }

    @Test
    public void DataAnalyzerTest_GetMax4_negatives() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(-2);
        numbers.add(-9);
        numbers.add(-10);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int maxValue =  da.GetMax();
        Assertions.assertEquals(-2, maxValue);

    }

    @Test
    public void DataAnalyzerTest_GetMax5_equal() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int maxValue =  da.GetMax();
        Assertions.assertEquals(5, maxValue);

    }

    @Test
    public void DataAnalyzerTest_GetMax6_zero() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int maxValue =  da.GetMax();
        Assertions.assertEquals(0, maxValue);
    }

    @Test
    public void DataAnalyzerTest_GetAverage1_zero() throws IOException{
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(0);
        numbers.add(0);
        numbers.add(0);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(0, avgValue);

    }
    @Test
    public void DataAnalyzerTest_GetAverage2() throws IOException{
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(2, avgValue);

    }
    @Test
    public void DataAnalyzerTest_GetAverage3() throws IOException{
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(1, avgValue);

    }

    @Test
    public void DataAnalyzerTest_GetAverage4_negatives1() throws IOException{
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(-2);
        numbers.add(-3);
        numbers.add(-1);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(-2, avgValue);

    }

    @Test
    public void DataAnalyzerTest_GetAverage4_negatives2() throws IOException{
        /*this test case to check if getAverage function is ceiling, flooring, rounding or just returning Integer
        if it is flooring rather than returning Integer therefore if we enter -1, -3, -4
        the expected is -2 but the actual will be -3 as flooring for -2.667 is -3*/

        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(-1);
        numbers.add(-3);
        numbers.add(-4);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(-2, avgValue);

    }
    @Test
    public void DataAnalyzerTest_GetAverage5() throws IOException{
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(5);
        numbers.add(0);
        numbers.add(-5);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(0, avgValue);

    }

    @Test
    public void DataAnalyzerTest_GetAverage6() throws IOException{
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(4);

        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int avgValue =  da.GetAverage();
        Assertions.assertEquals(2, avgValue);

    }
}
