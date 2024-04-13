package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        // create a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Gebrit " + name);
        scanner.nextLine();
        //System.out.print("Enter your name: ");
       // String name1 = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        float hoursWorked = scanner.nextFloat();
        System.out.println("Hours worked = " + hoursWorked);
        //scanner.nextDouble();
        //System.out.print("Enter hours worked: ");
        //double hoursWorked1 = scanner.nextDouble();

        //Rate
        System.out.print("Enter pay rate: ");
        float payRate = scanner.nextFloat();

        //Calculator their gross
        float grossPay = hoursWorked * payRate;

        // Display the employ's name and their gross pay
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Pay: $" + grossPay);

    }


}
