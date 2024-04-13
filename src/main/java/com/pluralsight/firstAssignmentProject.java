

package com.pluralsight;

import java.util.*;

public class firstAssignmentProject {
    public static void main (String [] args){


        // Initialize scanner for the user input
        Scanner scanner = new Scanner(System.in);

      double principal = 53000; // principal loan amount
      double annualInterestRate = 7.63; // Annual interest rate (7.625%)
      double time =365*15;

      double CI= (principal * annualInterestRate * time)/100;

     // System.out.println("CI " + CI);

        // Prompt user for input
        //double principal = scanner.nextDouble();
        System.out.println("Please enter the annual interest rate (in percentage): ");
        //double annualInterestRate = scanner.nextDouble();
        System.out.println("Please enter the loan length (in year): ");
        double  loanLengthYears = 15*365 ;//scanner.nextInt();


        //Calculation monthly interest rate and loan length in months
        //double monthlyInterestRate = annualInterestRate / 12 /100;
        int loanLengthMonthly =12;

        double amount= (principal * Math.pow(1+ (annualInterestRate/100),(loanLengthMonthly*loanLengthYears))) - principal;
        System.out.println("amount " + amount);
        System.out.println("Principal " + principal);
        double interest= amount - principal;
        System.out.println("Interest " + interest);

        double result= amount+ interest + principal;
        System.out.println("Result " + result );
        // Calculate monthly payment using the formula: M = P[r(1+r)^n]/[(1+r)^n - 1]
//        double monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanLengthMonthly /
//                        (Math.pow(1 + monthlyInterestRate, loanLengthMonthly) -1)));
//
//
//         monthlyPayment = principal * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, loanLengthMonthly))
//                / (Math.pow(1 + monthlyInterestRate, loanLengthMonthly) - 1);

//        // Calculate total interest paid over the life of the loan
//        double totalInterestPaid = monthlyPayment * loanLengthMonthly - principal;
//
//        // Display the results
//        System.out.println("Your monthly payment will be: $" + monthlyPayment);
//        System.out.println("Total interest paid over the life of the loan: $" + totalInterestPaid);


    }
}
