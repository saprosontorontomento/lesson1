package com.company.tasks;

import java.util.Scanner;

public class tryCalc {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            int num1= getInt();
            int num2 = getInt();
            String operation = getOperation();

            double result;

            try {
                result = calc(num1, num2, operation);

            } catch(ArithmeticException ex) {
                System.out.println("������� �� 0");
                return;
            }
            System.out.println("�����: " + num1 + operation + num2 + " = " + result);
        }
    }

    static int getInt() {
        int num;
        System.out.print("������� �����: ");
        try {
            num = in.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("������ �����!");
            in.next();
            num = getInt();
        }
        return num;
    }

    static String getOperation() {
        String s;
        String operation;
        System.out.print("������� ���� �������� (+, -, *, /): ");

        try {
            s = in.next();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                operation = s;

            } else throw new Exception ("������ �����!");

        } catch(Exception ex) {
            System.out.println(ex.getMessage());
            operation = getOperation();
        }
        return operation;
    }

    static double calc(int num1, int num2, String operation) {
        return switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> (double) num1 / num2;
            default -> 0;
        };
    }
}
