package com.pluralsight;

import java.util.Scanner;


public class Section4_1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to YearUp Imax");
        System.out.println("Please enter the age and the tiket price ");
        int age = input.nextInt();
/**

        //if the user is 10 or less the price is 5.00, if the user is 10-18
        // the price is 10.00 if the user is 18-50, the price Is 20.00 and if the user is older than 50 the price is 15.00

        double price = 0;
        //if decision statement: if (age <= 10)f
        if (age <= 10){
            price = 5.00;
        }else if (age < 18){
            price = 10.00;
        }else if (age <=50){
            price = 20.00;

        }else{
            price = 15.00;
        }

        System.out.println("Price of adimission: "+price);


        // Example 2:
        // Variable that holds b
        System.out.println("Please input your birth year : ");
        int birthYear = input.nextInt();
        String generation = "";
        if (birthYear >= 1901 && birthYear <= 1927){
            generation = "Geatest Generation";
        }else if (birthYear >= 1928 && birthYear <= 1945){
            generation = "Silent Generation";
        }else if (birthYear >= 1946 && birthYear <= 1964){
            generation = " baby boom generation";
        }else if (birthYear >= 1965 && birthYear <= 1980){
            generation = "Generation X";
        }else if (birthYear >= 1981 && birthYear <= 1996){
            generation = "Millennial Generation";
        }else if (birthYear >= 1997 && birthYear <= 2009){
            generation = "Generation Z";
        }else if(birthYear >= 2010 && birthYear <= 2024){
            generation ="Generation Alpha";
        }else {
            generation = "Invalid generation";
        }
        System.out.println("Your generation name is: "+generation);
        int num = input.nextInt();
        if (num%2 == 0)
            System.out.println("the number is even");
        else
            System.out.println("the number is odd");


        String name = "Ezra";
        int age = 25;
        double price = (age < 18) ? 22.50 : 25.00;
        System.out.println("Price of admission: " + price);
*/
    }
}
