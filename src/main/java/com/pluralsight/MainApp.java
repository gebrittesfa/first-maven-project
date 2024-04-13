/**package com.pluralsight;

public class MainApp {
    public static void main(String[] args) {
        //calling the methods
        //When you call the method what it takes in is called a parameter
        foo();
        moo();

        int a = 4, b = 9, c = 10, d = 3;
        addAndDisplay(a, b); // a and b are argm to the AddAndDisplay method
        addAndDisplay(b, c);
        addAndDisplay(a, d);
        //int result = add(4,9);
        int sum;
        sum = addA(a, b);
        display(a, b, sum);
        sum = add(b, c);
        display(b, c, sum);
        sum = add(a, d);
        display(a, d, sum);
    }

    //Defintion of the methods; access modifier (public) static (optionla) return types
    // When you call the method what it takes in is called a parameter
    public static void foo() {
        System.out.println("Foo");
    }

    public static void moo() {
        System.out.println("Moo");
    }
    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}

*/