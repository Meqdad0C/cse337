package Labs;

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
        fileHandler.SetFilePath("C:\\Users\\Documents\\SW Testing\\cse337\\src\\main\\java\\org\\labs\\Three\\numbers.txt");

        Assertions.assertEquals("C:\\Users\\Documents\\SW Testing\\cse337\\src\\main\\java\\org\\labs\\Three\\numbers.txt",fileHandler.filePath);
    }

    @Test
    public void FileHandler_GetData_Test() throws IOException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.filePath = "C:\\Users\\stc\\numbers.txt"; // Change this path according to location of the file
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
        int maxValue =  da.GetMax();
        Assertions.assertEquals(20, maxValue);
    }
    @Test
    public void DataAnalyzerTest_GetMax1_oneElement() throws IOException {
        FileHandler fileHandler = mock(FileHandler.class);

        Vector<Integer> numbers = new Vector<>();
        numbers.add(20);


        when(fileHandler.GetData()).thenReturn(numbers);

        DataAnalyzer da = new DataAnalyzer(fileHandler);
        int minValue =  da.GetMin();
        Assertions.assertEquals(20, minValue);
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
    public void DataAnalyzertest_GetAverage1_zero() throws IOException{
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
    public void DataAnalyzertest_GetAverage2() throws IOException{
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
    public void DataAnalyzertest_GetAverage3() throws IOException{
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
    public void DataAnalyzertest_GetAverage4_negatives() throws IOException{
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
    public void DataAnalyzertest_GetAverage5() throws IOException{
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
    public void DataAnalyzertest_GetAverage6() throws IOException{
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
