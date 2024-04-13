package com.pluralsight;

public class PracticeOperations {
    public static void main(String[] args){
        //concatenting the 3 string
        String str1 = "Hi ";
        String str2 = "Almaz ";
        String str3 = "Werqi";

        String completeString = str1 + str2 + str3;
        System.out.println("Complete String: " + completeString);

        // performing operation double
        double num1 = 5.987;
        double num2 = 3.90;
        double num3 = 1.56;

        // Now we need another double that hold the result
        double result = num1 + num2 + num3;
        System.out.println(result);
        //Subtraction
        result = num1 - num2 - num3;
        System.out.println(result);
        //Multiplacation
        result = num1 * num2 * num3;
        System.out.println(result);

        //divided  the result
        result = num1 / num2 / num3;
        System.out.println(result);

        // Accumulating the division result with 10 100 1000
        double accumulation = result + 10;
        System.out.println(accumulation);
        accumulation = accumulation + 100;
        System.out.println(accumulation);
        accumulation = accumulation + 1000;
        System.out.println(accumulation);
/**
        System.out.println("Addition Result: " + addingResult);
        System.out.println("Subtracting Result:" + subtractingResult );
        System.out.println("Multiplication Result:" + multiplyingResult );
        System.out.println("Division Result:" + divisionResult );
        System.out.println("Accumulation Result:" + accumulationResult );
*/

    }

}

