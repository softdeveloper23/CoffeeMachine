package machine;

import java.util.Scanner;


public class CoffeeMachine {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int disposableCups;
    private int money;

    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.disposableCups = 9;
        this.money = 550;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
            printState();
            System.out.println("\nWrite action (buy, fill, take): ");
            String action = scanner.nextLine();
            processAction(action, scanner);
            printState();
        }

    private void processAction(String action, Scanner scanner) {
        switch (action) {
            case "buy":
                buy(scanner);
                break;
            case "fill":
                fill(scanner);
                break;
            case "take":
                take();
                break;
            default:
                break;
        }
    }

    private void buy(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                makeCoffee(250, 0, 16, 4);
                break;
            case "2":
                makeCoffee(350, 75, 20, 7);
                break;
            case "3":
                makeCoffee(200, 100, 12, 6);
                break;
        }
    }

    private void makeCoffee(int waterNeeded, int milkNeeded, int beansNeeded, int cost) {
        if (water >= waterNeeded && milk >= milkNeeded && coffeeBeans >= beansNeeded && disposableCups >= 1) {
            water -= waterNeeded;
            milk -= milkNeeded;
            coffeeBeans -= beansNeeded;
            disposableCups --;
            money += cost;
        } else {
            System.out.println("Sorry, not enough resources!");
        }
    }

    private void fill(Scanner scanner) {
        System.out.println("Write how many ml of water you want to add: ");
        water += scanner.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        milk += scanner.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += scanner.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        disposableCups += scanner.nextInt();
        scanner.nextLine(); // Consume newline
    }

    private void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    private void printState() {
        System.out.println("\nThe coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(disposableCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();
    }
}