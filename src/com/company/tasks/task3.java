package com.company.tasks;

import java.util.Scanner;

public class task3 {
    static Scanner sc = new Scanner(System.in);

    // task 3

    public static int getWeight() {
        int a = sc.nextInt();
        while (a == 0) {
            System.out.println("�� ����� ����, ������� ���������� ���");
            a = sc.nextInt();
        }
        return a;
    }

    public static void main(String[] args) {

        int gift;
        int orange;
        int apple;
        int pear;

        System.out.println("������� ��� �������");
        gift = getWeight();
        System.out.println("������� ��� ����������");
        orange = getWeight();
        System.out.println("������� ��� �����");
        apple = getWeight();
        System.out.println("������� ��� ����");
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
        System.out.println("��������� ���������: " + count);
    }
    // task 3
}
