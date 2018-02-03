package com.company;
import java.util.Scanner;

public class Calculator {

    // Calling function that chooses calculator A or B
    public static void main(String args[]) {
        chooseCalculatorType();
    }

    // choosing calculator A or B and calls functions calculatorB and calculatorA
    private static void chooseCalculatorType() {
        String whichCalc;
        Scanner in = new Scanner(System.in);
        //Choose which calculator
        System.out.println("Hello there! Which calculator would you like to use? Type b for basic, or a for advanced: ");
        whichCalc = in.nextLine();
        System.out.println("You chose calculator: " + whichCalc);
        if (whichCalc.equals("b")) {
            calculatorB();
        } else if (whichCalc.equals("a")) {
            calculatorA();
        } else {
            System.out.println("This option is invalid");
        }
    }

    //basic calculator
    private static void calculatorB() {
        String function;
        String firstNum;
        String secondNum;
        // catching user input in console
        Scanner in = new Scanner(System.in);
        // first number
        System.out.println("Please enter your first number");
        firstNum = in.nextLine();
        // selecting function
        System.out.println("What function would you like to use? Type +, -, *, / : ");
        function = in.nextLine();
        // second number
        System.out.println("Please enter your second number");
        secondNum = in.nextLine();
        // result
        if (function.equals("+")) {
            float result = Float.parseFloat(firstNum) + Float.parseFloat(secondNum);
            System.out.println("The answer is " + result);
        } else if (function.equals("-")) {
            float result = Float.parseFloat(firstNum) - Float.parseFloat(secondNum);
            System.out.println("The answer is " + result);
        } else if (function.equals("/")) {
            float result = Float.parseFloat(firstNum) / Float.parseFloat(secondNum);
            System.out.println("The answer is " + result);
        } else if (function.equals("*")) {
            float result = Float.parseFloat(firstNum) * Float.parseFloat(secondNum);
            System.out.println("The answer is " + result);
        } else {
            System.out.println("This is invalid");
        }
    }
        // Advanced calculator
    private static void calculatorA() {
        String function;
        String firstNum;
        String secondNum;
        // catching user input in console
        Scanner in = new Scanner(System.in);
        // selecting function
        System.out.println("What function would you like to use? Type s for square root and p to find the power of: ");
        function = in.nextLine();
        // finding the power of
        if (function.equals("p")) {
            // first number
            System.out.println("Please enter your first number");
            firstNum = in.nextLine();
            // second number
            System.out.println("Please enter your second number");
            secondNum = in.nextLine();
            // result
            float result = (float) Math.pow(Float.parseFloat(firstNum), Float.parseFloat(secondNum));
            System.out.println("The answer is " + result);
            // Finding the square root
        } else if (function.equals("s")) {
            //number to square root
            System.out.println("Please enter the number you want to square root: ");
            firstNum = in.nextLine();
            float result = (float) Math.sqrt(Float.parseFloat(firstNum));
            System.out.println("The answer is " + result);
        } else {
            System.out.println("This is invalid");
        }

    }

}
