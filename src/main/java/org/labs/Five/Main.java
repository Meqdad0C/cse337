package org.labs.Five;

import java.util.Scanner;

public class Main {

    static MakeCoffee mc;
    private static MakeCoffeeFactory makeCoffeeFactory = new MakeCoffeeFactory();

    public static void callStart(){
        mc.start();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWants to Start Mechine Y or N ?");
        char d;
        d = scan.next().charAt(0);
        if (d == 'Y' || d == 'y') {
            CoffeeMachine cm = new CoffeeMachine(); // Instances For CoffeMachine
            mc = new MakeCoffee(cm, scan); // Instances For MakeCoffee
            callStart();
//            mc.start(); // In order to call All Private Method Calling Public mathod
            System.out.println("Shutting Down...\n");
        } else
            System.out.println("Shutting Down...\n");
    }

    // Factory method to allow mocking

}

