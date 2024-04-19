package org.labs.Five;

class CoffeeMachine{

    private double coffee_powder, milk, water;
    private int Coffee_Count = 0;
    public CoffeeMachine(){ //Default Constructor Initialization...
        this.coffee_powder=0;
        this.milk=0;
        this.water=0;
    }
    void SetIngredient(){   //Calling for Filling Ingredient...
        System.out.println("\nFilling...");
        this.coffee_powder = 500.0;
        this.milk = 1;
        this.water= 2;
        System.out.println("Filling Completed.");
    }
     void GetIngredient(){   //To Get Status
        System.out.println("Available Coffee Power(Gram) "+String.format("%.1f",this.coffee_powder));
        System.out.println("Available Milk(Liter) "+String.format("%.1f", this.milk));
        System.out.println("Available Water(Liter) "+String.format("%.1f", this.water));
    }
    void CleanMachine(){    //Initialization with Null In order to Clean Machine
        System.out.println("\nCleaning Machine...");
        this.coffee_powder = 0;
        this.milk = 0;
        this.water= 0;
        System.out.println("Cleaning Completed.");
    }



    public void setCoffee_powder(double coffee_powder) {
        this.coffee_powder = coffee_powder;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public void setCoffee_Count(int coffee_Count) {
        Coffee_Count = coffee_Count;
    }

    public double getCoffee_powder() {
        return coffee_powder;
    }

    public double getMilk() {
        return milk;
    }

    public double getWater() {
        return water;
    }

    public int getCoffee_Count() {
        return Coffee_Count;
    }
}
