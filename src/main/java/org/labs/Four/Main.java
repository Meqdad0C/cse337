package org.labs.Four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, totalDigits = 0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while (num!=0){
            totalDigits++;
            num /= 10;
        }
        System.out.print(totalDigits);
        s.close();
    }
}