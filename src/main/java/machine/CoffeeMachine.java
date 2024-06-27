package machine;

import java.util.Scanner;


public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int reqWater = 200;
        int reqMilk = 50;
        int reqCoffeeBeans = 15;

        int water = 0;
        int milk = 0;
        int coffeeBeans = 0;

        int cupsPossible = 0;

        System.out.println("Write how many ml of water the coffee machine has:");
        water = scanner.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has:");
        milk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        coffeeBeans = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int neededWater = reqWater * cups;
        int neededMilk = reqMilk * cups;
        int neededCoffeeBeans = reqCoffeeBeans * cups;

        System.out.println("For " + cups + " cup(s) of coffee you will need:");
        System.out.println(neededWater + " ml of water");
        System.out.println(neededMilk + " ml of milk");
        System.out.println(neededCoffeeBeans + " g of coffee beans");

        if ((water == neededWater) && (milk == neededMilk) && (coffeeBeans == neededCoffeeBeans)) {
            System.out.println("Yes, I can make that amount of coffee \n");

            System.out.println("Starting to make a coffee...");
            System.out.println("Grinding coffee beans...");
            System.out.println("Boiling water...");
            System.out.println("Mixing boiled water with crushed coffee beans...");
            System.out.println("Pouring coffee into the cup...");
            System.out.println("Pouring some milk into the cup...");
            System.out.println("Coffee is ready!");

        } else if ((water > neededWater) && (milk > neededMilk) && (coffeeBeans > neededCoffeeBeans)) {

            while ((neededWater <= water) && (neededMilk <= milk) && (neededCoffeeBeans <= coffeeBeans)) {
                neededWater = neededWater - water;
                neededMilk = neededMilk - milk;
                neededCoffeeBeans = neededCoffeeBeans - coffeeBeans;
                cupsPossible ++;
            }

            System.out.println("Yes, I can make that amount of coffee, plus " + cupsPossible + " more \n");

            System.out.println("Starting to make a coffee...");
            System.out.println("Grinding coffee beans...");
            System.out.println("Boiling water...");
            System.out.println("Mixing boiled water with crushed coffee beans...");
            System.out.println("Pouring coffee into the cup...");
            System.out.println("Pouring some milk into the cup...");
            System.out.println("Coffee is ready!");

        } else {
            System.out.println("No, I can't make that amount of coffee");
        }
    }
}
