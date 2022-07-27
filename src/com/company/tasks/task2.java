package com.company.tasks;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        // task 2

        Scanner scanner = new Scanner(System.in);

        System.out.print("ПРОЛВЕРКА РУССКИХ БУКВ enter ticket number: ");

        int number = scanner.nextInt(); // получаем ticket

        // 120120

        int step = 1; // шаг
        int count = 0; // счётчик
        int sum = 0; // сумма
        while (number != 0) { // если ticker не равен 0 идём в цикл
            System.out.println(sum);
            System.out.println(step);
            System.out.println(number);
            System.out.println(count);
            sum += step * (number % 10); // sum = 1 * (ticket остаток от деления на 10)
            number /= 10; // убираем последнюю цифру
            if (++count == 3) { // не знаю как решить без магических констант
                step = -step;

            }
        }
        if (count == 6 && sum == 0) { // если count = 6 и sum = 0
            System.out.println("lucky ticket");
        } else if (count != 6) {
            System.out.println("incorrect ticket!");
        } else {
            System.out.println("not lucky ticket");
        }
    }
}
        // task 2

