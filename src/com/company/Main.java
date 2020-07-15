package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        water /= 200; // gives amount of cups able to make based on this ingredient
        milk /= 50; // gives amount of cups able to make based on this ingredient
        beans /= 15; // gives amount of cups able to make based on this ingredient

        int min = Math.min(water, milk);
        min = Math.min(min, beans); // the maximum amount of cups we can make based on total ingredients

        if (cups == min) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cups < min) {
            System.out.print("Yes, I can make that amount of coffee (and even " + (min - cups) + " more than that");
        } else {
            System.out.println("No, I can only make " + min + " cup(s) of coffee");
        }
    }
}
