package org.labs.Five;

public class MilkCoffee extends Coffee {

    public MilkCoffee(CoffeeMachine cm) {
        super(cm);
        milkAmount = 0.4;
    }

   public void MilkCoffeeMake() {
        if (cm.getCoffee_powder() >= coffeeGrams && cm.getMilk() >= milkAmount && cm.getWater() >= waterAmount) {
            System.out.println("\nMaking Milk Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            cm.setCoffee_powder(cm.getCoffee_powder() - 10);
            System.out.println("Taking 0.4 Liter of Milk.");
            cm.setMilk(cm.getMilk() - 0.4);
            System.out.println("Taking 0.2 liter of Water.");
            cm.setWater(cm.getWater() - 0.2);
            System.out.println("\nYour Milk Coffee is Ready.");
            cm.setCoffee_Count(cm.getCoffee_Count() + 1);
        } else {
            System.out.println("\nAvailable Coffee Power(Gram) " + String.format("%.1f", cm.getCoffee_powder()));
            System.out.println("Available Milk(Liter) " + String.format("%.1f", cm.getMilk()));
            System.out.println("Available Water(Liter) " + String.format("%.1f", cm.getWater()));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }
}
