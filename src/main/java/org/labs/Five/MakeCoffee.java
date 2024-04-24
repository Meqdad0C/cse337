package org.labs.Five;
import java.util.Scanner;


public class MakeCoffee {
    CoffeeMachine cm;
    Scanner scan;

    public MakeCoffee(CoffeeMachine cm, Scanner scan){
        this.cm = cm;
        this.scan = scan;
    }

    public MakeCoffee() {

    }

    public  void start(){    //public Start to accese all private method of this class
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("|                   Coffee Machine By Manikant                   |");
        System.out.println(" ----------------------------------------------------------------");
        //System.out.println("Currently We Have Following Operations, Select as your Need:- ");
        System.out.println("\nCurrent Status: ");
        cm.GetIngredient();
        boolean t = true;
        while(t){
            System.out.println("\n -------------------------------- ");
            System.out.println("|1:     Status of Ingredient     |\n -------------------------------- \n|2:      Fill Ingredient         |\n -------------------------------- \n|3:       Clean Machine          |\n -------------------------------- \n|4:        Make Coffee           |\n -------------------------------- \n|5: How many Coffee We have made?|\n -------------------------------- \n|6:        Exit                  |");
            System.out.println(" -------------------------------- \n\n");
            char c = scan.next().charAt(0);
            switch(c){
                case '1':
                    System.out.println("------------- Status ------------");
                    cm.GetIngredient();
                    System.out.println("---------------------------------");
                    break;
                case '2':
                    cm.SetIngredient();
                    break;
                case '3':
                    cm.CleanMachine();
                    break;
                case '4':
                    makeCoffee();
                    break;
                case '5':
                    System.out.println("\nWe Have Made "+cm.getCoffee_Count()+" Coffees.");
                    break;
                case '6':
                    System.out.println("\nExiting...\n");
                    t = false;
                    break;
            }
        }
    }

     public void makeCoffee(){  //Coffee Selection Menu
        System.out.println("\n ------------------ ");
        System.out.println("|   Select Type:   |\n ------------------ \n| 1:  Black Coffee |\n| 2:  Milk Coffee  |\n| 0   to Discard   |");
        System.out.println(" ------------------ \n");
        char t = scan.next().charAt(0);

        switch(t){
            case '1':
                BlackCoffee blackCoffee= new BlackCoffee(cm);
                blackCoffee.BlackCoffeeMake();//Call to BlackCoffee Method
                break;
            case '2':
                MilkCoffee milkCoffee = new MilkCoffee(cm);
                milkCoffee.MilkCoffeeMake();//Call to MilkCoffee Method
                break;
            case '0':
                break;
        }
    }
}
