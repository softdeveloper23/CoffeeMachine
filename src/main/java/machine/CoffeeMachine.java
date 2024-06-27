package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int coffeeBeans = 15;

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();
        water = water * cups;
        milk = milk * cups;
        coffeeBeans = coffeeBeans * cups;

        System.out.println("For " + cups + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");

        System.out.println();

        System.out.println("Starting to make a coffee...");
        System.out.println("Grinding coffee beans...");
        System.out.println("Boiling water...");
        System.out.println("Mixing boiled water with crushed coffee beans...");
        System.out.println("Pouring coffee into the cup...");
        System.out.println("Pouring some milk into the cup...");
        System.out.println("Coffee is ready!");
    }
}
