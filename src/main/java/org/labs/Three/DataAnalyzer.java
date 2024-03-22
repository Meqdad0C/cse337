package org.labs.Three;

import java.io.IOException;
import java.util.Vector;

public class DataAnalyzer {
    FileHandler fileHandler;

    public DataAnalyzer(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public int GetMin() throws IOException {
        Vector<Integer> numbers = fileHandler.GetData();
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            min = Integer.min(min, number);
        }
        return min;
    }

    public int GetMax() throws IOException {
        Vector<Integer> numbers = fileHandler.GetData();
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            max = Integer.max(max, number);
        }
        return max;
    }

    public int GetAverage() throws IOException {
        Vector<Integer> numbers = fileHandler.GetData();
        int average = 0;
        for (Integer number : numbers) {
            average += number;
        }
        average = average / numbers.size();
        return average;
    }
}
