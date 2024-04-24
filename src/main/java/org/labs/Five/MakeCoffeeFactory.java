package org.labs.Five;

import java.util.Scanner;

public class MakeCoffeeFactory {
    public MakeCoffee createMakeCoffee(CoffeeMachine cm, Scanner scanner) {
        return new MakeCoffee(cm, scanner);
    }
}
