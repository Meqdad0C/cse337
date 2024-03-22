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
}
