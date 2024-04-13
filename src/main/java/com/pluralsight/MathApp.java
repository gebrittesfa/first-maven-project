package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        // variable  to represent the salary for Bob and Gary
        double bobSalary = 95678;
        double garySalary = 78756;
        double highestSalary;



        // Determine the highest salary using Math.max
        double maxSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is " + "bobSalary " + bobSalary);
        System.out.println("The lowest salary is " + "garySalary " + garySalary);

        // car and truck price
        double carPrice = 55000;
        double truckPrice = 67000;

        // the price of car
        double minSalary = Math.min(carPrice, truckPrice);
        System.out.println("The smallest price is " + "carPrice " + carPrice);

        // Find and display the area of circle whose radius is 7.25
        double radius = 7.25;
        double areaOfCircle = Math.PI * radius * radius;
        System.out.println("Area of circle: " + areaOfCircle);

        // Finding the display of square root a variable after set to 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);
        System.out.println("Square Root of " + number+ ": " + squareRoot);

        // Finding the display (5, 10) and (85, 50)
        int x1 = 5, x2 = 85, y1 = 10, y2 = 50;
        double distance;
        int xm = x2 - x1;
        int ym = y2 - y1;
        distance = Math.sqrt(Math.pow(xm, 2) + Math.pow(ym, 2));
        System.out.println("Distance between the point: " + distance);

        // Find the display the absolute positive value
        double negativNumber = -3;
        double absoluteValue = Math.abs(negativNumber);
        System.out.println("Absolute value of: " + negativNumber + ": " + absoluteValue);

        // Find the display a random number between 0 and 1
        double randomNumber = Math.random();
        System.out.println("Random number between 0 and 1: " + randomNumber);






/**
        int natKidCount = 2, brittKidCount = 4;
        int mostKids = Math.max(natKidCount, brittKidCount);
        System.out.println("The biggest family has " + mostKids + " kids");
        System.out.println("The smallest family has " + natKidCount + " kids");

    int answer = 0;
    answer = answer + 10; // 10
    answer = answer - 5; // 5
    answer = answer * 10; // 50
    answer = answer / 2; // 25
    answer = answer % 10; // 5 (int remainder of 25 / 10)
    */

    }
}
