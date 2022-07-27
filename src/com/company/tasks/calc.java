package com.company.tasks;

import com.sun.jdi.event.ExceptionEvent;

import java.util.Scanner;

public class calc {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            double num1 = getNum();
            double num2 = getNum();
            String operation = getOperation();
            double result;

            if (operation.equals("stop")) {
                System.out.println("u wrote a stop word");
                break;
            } else {
                result = calc(num1, num2, operation);
            }

            if (operation.equals("/") && num2 == 0) {
                System.out.println("division by zero");
            } else if (operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")) {
                System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
            } else {
                System.out.println("Hmm... Try first.");
            }
        }
    }

        public static double getNum () { // получаем число
            System.out.println("Enter the NUMBER:");
            double num;
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
            } else {
                System.out.println("An error was made while entering a number. Try again.");
                scanner.next();
                num = getNum();
            }
            return num;
        }

        public static String getOperation () { // получаем операцию
            String operation = " ";
            System.out.println("Enter an operation: + - * /");

            if (scanner.hasNext()) {
                operation = scanner.next();
            }
            return operation;
        }

        public static double calc ( double num1, double num2, String operation){ // считаем
            double result = 0;
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;
                default:
                    break;
            }
            return result;
        }
}
