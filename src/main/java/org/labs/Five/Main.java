package org.labs.Five;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWants to Start Mechine Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if (d == 'Y' || d == 'y') {
            CoffeeMachine cm = new CoffeeMachine(); // Instances For CoffeMachine
            MakeCoffee mc = new MakeCoffee(cm, scan); // Instances For MakeCoffee
            mc.start(); // In order to call All Private Method Calling Public mathod
            System.out.println("Shutting Down...\n");
        } else
            System.out.println("Shutting Down...\n");
    }
}
