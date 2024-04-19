package org.labs.Five;

public class BlackCoffee extends Coffee {

    public BlackCoffee(CoffeeMachine cm) {
        super(cm);
    }

   public void BlackCoffeeMake() {
        if (cm.getCoffee_powder() >= coffeeGrams && cm.getWater() >= waterAmount) {
            System.out.println("\nMaking Black Coffee...");
            System.out.println("\nTaking 10gm of Coffee Powder.");
            cm.setCoffee_powder(cm.getCoffee_powder() - 10);
            System.out.println("Taking 0.2 liter of Water.");
            cm.setWater(cm.getWater() - 0.2);
            System.out.println("\nYour Black Coffee is Ready.");
            cm.setCoffee_Count(cm.getCoffee_Count() + 1);
        } else {
            System.out.println("\nAvailable Coffee Power(Gram) " + String.format("%.1f", cm.getCoffee_powder()));
            System.out.println("Available Water(Liter) " + String.format("%.1f", cm.getWater()));
            System.out.println("\nSome Iteams Are Not Available, Please Fill before Making Coffee.");
        }
    }

}
