package com.pluralsight;

public class BasicFloatingPointMathApp {
    public static void main(String[] args) {

    float a = 10;
    float b = 3;
    float result;
    result = a +b;

    System.out.println(result); // displays 13. 0

    result = a - b;

    System.out.println(result); // displays 7.0

    result = a * b;

    System.out.println(result); // displays 30. 0

    result = a / b;

    System.out.println(result); // displays 3.3333333

    result = a % b;

    System.out.println(result); // displays 1.0

    result = b - (a % b);

    System.out.println(result); // displays 2. 0
        /**
        int count = 11;
        double unitPrice = 7.12;
        double taxRate = 0.825;
        double totalCost;
        totalCost = (count * unitPrice) * (1 + taxRate);
        System.out.println(totalCost);   */
    }
}
