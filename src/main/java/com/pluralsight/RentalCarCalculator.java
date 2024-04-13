package com.pluralsight;
import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pickup date (YYYY-MM-DD): ");
        String pickupDate = scanner.nextLine();
        System.out.print("Enter number of rental days: ");
        int rentalDays = scanner.nextInt();
        scanner.nextLine(); // Consume newline left by nextInt()
        System.out.print("Do you want an electronic toll tag? (yes/no): ");
        String tollTagInput = scanner.nextLine().toLowerCase();
        System.out.print("Do you want a GPS? (yes/no): ");
        String gpsInput = scanner.nextLine().toLowerCase();
        System.out.print("Do you want roadside assistance? (yes/no): ");
        String roadsideAssistanceInput = scanner.nextLine().toLowerCase();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // The calculation options
        double basicRentalRate = 29.99;
        double tollTagCostPerDay = 3.95;
        double gpsCostPerDay = 2.95;
        double roadsideAssistanceCostPerDay = 3.95;
        double underageSurchargeRate = 0.3;

        // the calculation basic car rent cost
        double basicRentalCost = basicRentalRate * rentalDays;

        // options cost
        double optionCost = 0;
        if (tollTagInput.equals("yes")) {
            optionCost += tollTagCostPerDay * rentalDays;
        }if(gpsInput.equals("yes")){
            optionCost += gpsCostPerDay * rentalDays;
        }if (roadsideAssistanceInput.equals("yes")) {
            optionCost += roadsideAssistanceCostPerDay * rentalDays;
        }
        //under age drivers
        double underageSurcharge = 0;
        if (age < 25) {
            underageSurcharge = basicRentalCost + underageSurchargeRate;
        }
        //Total cost
        double totalCost = basicRentalCost + optionCost + underageSurcharge;
        //Display resulte
        System.out.println("\nEstimated Cost Breakdown: ");
        System.out.printf("Basic car rental: $%.2f\n", basicRentalCost);
        System.out.printf("Options cost: $%.2f\n", optionCost);
        System.out.printf("Underage driver cost: $%.2f\n", underageSurcharge);
        System.out.printf("Total cost: $%.2f\n", totalCost);

    }
}
