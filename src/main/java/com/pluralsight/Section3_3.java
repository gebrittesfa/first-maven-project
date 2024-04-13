package com.pluralsight;

import java.util.*;
public class Section3_3 {
    public static void main(String[] args) {
        System.out.print("Ezra ");
        System.out.println("Williams");
        System.out.println("Hey! This is my name!");
        System.out.print("Noel ");
        System.out.print("Guillen");

        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;
        System.out.println(
                "Total due is: " + String.format("%.2f", totalDue));
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f ", name, id, pay);

        // How do we read from the console
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = myScanner.nextLine();
        System.out.println("Howdy " + name1);

        double userInput1, userInput2;
        System.out.print("Please enter the first number:");
        // geet the result from tec console using nextDouble()
        userInput1 = myScanner.nextDouble();
        System.out.println();
        System.out.print("Please enter the first number:");
        userInput2 = myScanner.nextDouble();
        double result = userInput1 + userInput2;
        System.out.printf("Your n added together is %.2f", result);


    }
}
