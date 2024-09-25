package org.example;

public class Calculator {

    // Method to calculate factorial
    public static int factorial(int num) {
        if (num < 0) {
            return -1;  // return -1 for invalid input
        }
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate square root
    public static double sqrt(double num) {
        if (num < 0) {
            return -1;
        }
        return Math.sqrt(num);
    }

    // Method to calculate natural logarithm
    public static double log(double num) {
        if (num <= 0) {
            return -1;
        }
        return Math.log(num);
    }

    // Method to calculate power of a number
    public static double pow(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("-------- Welcome to Calculator Program - SPE ---------");
        System.out.println(" ");
        System.out.println("-------- Please Enter the Operation: ------------");
        System.out.println("1 -> Factorial");
        System.out.println("2 -> Square Root");
        System.out.println("3 -> Natural Logarithm");
        System.out.println("4 -> Power Function");
        System.out.println("5 -> Exit the Calculator");

        System.out.println(" ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter integer whose factorial you want to calculate: ");
                int num = sc.nextInt();
                int factorialResult = factorial(num);
                if (factorialResult == -1) {
                    System.out.println("Please Enter valid non-negative Integer Input");
                } else {
                    System.out.println("Factorial of " + num + " is: " + factorialResult);
                }
                break;

            case 2:
                System.out.print("Enter number whose square root you want to calculate: ");
                double sqrtNum = sc.nextDouble();
                double sqrtResult = sqrt(sqrtNum);
                if (sqrtResult == -1) {
                    System.out.println("Please Enter valid Input >= 0");
                } else {
                    System.out.println("Square root of " + sqrtNum + " is: " + sqrtResult);
                }
                break;

            case 3:
                System.out.print("Enter a number for natural log: ");
                double logNum = sc.nextDouble();
                double logResult = log(logNum);
                if (logResult == -1) {
                    System.out.println("Please Enter a valid number greater than 0");
                } else {
                    System.out.println("Natural log of " + logNum + " is: " + logResult);
                }
                break;

            case 4:
                System.out.print("Enter the base (x) and the exponent (b) for power function (x^b): ");
                double base = sc.nextDouble();
                double exponent = sc.nextDouble();
                double powerResult = pow(base, exponent);
                System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
                break;

            case 5:
                System.out.println("Exiting the calculator");
                break;

            default:
                System.out.println("Invalid operation choice. Please try again.");
        }

        sc.close();
    }
}

//package org.example;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import java.util.*;
//
//public class Main {
//    private static final Logger logger = LogManager.getLogger(Main.class);
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int op, flag = 0;
//        double num1;
//        logger.info("Start of Execution");
//
//        System.out.println("------------Scientific Calculator--------------");
//        do {
//            System.out.println("Choices of Operations:");
//            System.out.println("1. Square Root");
//            System.out.println("2. Factorial");
//            System.out.println("3. Natural Logarithm");
//            System.out.println("4. Power");
//            System.out.println("5. Exit");
//            System.out.println("Enter your choice(number): ");
//            op = scan.nextInt();
//            if (op == 5) flag = 1;
//            else {
//                switch (op) {
//                    case 1:
//                        System.out.println("You Chose Square Root!!");
//                        System.out.print("Enter Operand: ");
//                        num1 = scan.nextDouble();
//                        System.out.println("Result is: " + SquareRoot(num1));
//                        break;
//
//                    case 2:
//                        System.out.println("You Chose Factorial!!");
//                        System.out.print("Enter Operand: ");
//                        int numFact = scan.nextInt();
//                        System.out.println("Result is: " + Factorial(numFact));
//                        break;
//
//                    case 3:
//                        System.out.println("You Chose Natural Logarithm!!");
//                        System.out.print("Enter Operand: ");
//                        num1 = scan.nextDouble();
//                        System.out.println("Result is: " + NaturalLog(num1));
//                        break;
//
//                    case 4:
//                        System.out.println("You Chose Power!!");
//                        System.out.print("Enter Base: ");
//                        double base = scan.nextDouble();
//                        System.out.print("Enter Exponent: ");
//                        double exponent = scan.nextDouble();
//                        System.out.println("Result is: " + Power(base, exponent));
//                        break;
//                }
//            }
//        } while (flag == 0);
//    }
//
//    public static double SquareRoot(double n1) {
//        logger.info("START OP: Square Root");
//        double res = Math.sqrt(n1);
//        logger.info("[SQUARE ROOT OPERATION] [SUCCESS] sqrt(" + n1 + ") = " + res);
//        logger.info("END OP: Square Root");
//        return res;
//    }
//
//    public static int Factorial(int n1) {
//        logger.info("START OP: Factorial");
//        int res = 1;
//        for (int i = 1; i <= n1; i++) {
//            res *= i;
//        }
//        logger.info("[FACTORIAL OPERATION] [SUCCESS] " + n1 + "! = " + res);
//        logger.info("END OP: Factorial");
//        return res;
//    }
//
//    public static double NaturalLog(double n1) {
//        logger.info("START OP: Natural Logarithm");
//        if (n1 <= 0) {
//            logger.error("Natural log of non-positive numbers is undefined!");
//            throw new IllegalArgumentException("Natural log of non-positive numbers is undefined.");
//        }
//        double res = Math.log(n1);
//        logger.info("[NATURAL LOG OPERATION] [SUCCESS] ln(" + n1 + ") = " + res);
//        logger.info("END OP: Natural Logarithm");
//        return res;
//    }
//
//    public static double Power(double base, double exponent) {
//        logger.info("START OP: Power");
//        double res = Math.pow(base, exponent);
//        logger.info("[POWER OPERATION] [SUCCESS] " + base + "^" + exponent + " = " + res);
//        logger.info("END OP: Power");
//        return res;
//    }
//}