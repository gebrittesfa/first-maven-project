package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // create a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter number 2: ");
        int num2 = scanner.nextInt();
        //Consume the CRLE so move on to
        scanner.nextLine();
        System.out.println("What do you want to do? ");
        System.out.println("Enter 'A' or 'S': ");
        System.out.println("Enter 'M' or 'D': ");
        String action = scanner.nextLine();
        System.out.println("Preparing to do math... ");

        int result = 0;
        if (action.equals("A")) {
            result = num1 + num2;
        } else if (action.equals("S")) {
            result = num1 - num2;
        }else if (action.equals("M")){
            result = num1 * num2;
        }else if (action.equals("D")){
            result = num1 / num2;
        }
        System.out.println("The result is :" + " " + result);
    }
}
