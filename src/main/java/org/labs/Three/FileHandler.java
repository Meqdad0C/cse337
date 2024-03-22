package org.labs.Three;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class FileHandler {
    public String filePath;

    public void SetFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Vector<Integer> GetData() throws IOException {
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        Vector<Integer> numbers = new Vector<>();

        int linesCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < linesCount; i++) {
            int nextNum = Integer.parseInt(br.readLine());
            numbers.add(nextNum);
        }

        return numbers;
    }
}
