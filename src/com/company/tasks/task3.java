package com.company.tasks;

import java.util.Scanner;

public class task3 {
    static Scanner sc = new Scanner(System.in);

    // task 3

    public static int getWeight() {
        int a = sc.nextInt();
        while (a == 0) {
            System.out.println("Вы ввели ноль, укажите правильный вес");
            a = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {

        int gift;
        int orange;
        int apple;
        int pear;

        System.out.println("Введите вес подарка");
        gift = getWeight();
        System.out.println("Введите вес апельсинов");
        orange = getWeight();
        System.out.println("Введите вес яблок");
        apple = getWeight();
        System.out.println("Введите вес груш");
        pear = getWeight();

        int count = 0;

        for (int a = 0; a <= gift; a += orange) {
            for (int b = 0; b <= gift; b += apple) {
                for (int c = 0; c <= gift; c += pear) {
                    if (a + b + c == gift) {
                        count++;
                    }
                }
            }
        }
        System.out.println("Возможных вариантов: " + count);
    }
    // task 3
}
