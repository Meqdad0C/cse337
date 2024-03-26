package org.labs.Four;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CountTotalDigits
{
    public static void main(String[] args)
    {
        long num =0 ; int totalDigits=0;
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a Number: ");

        //check if the string not a number
        try {
            num = s.nextLong();
        }
        catch (InputMismatchException e){
        }

        while(num!=0)
        {
            totalDigits++;
            num = num/10;
        }
        System.out.print(totalDigits);
        s.close();
    }
}