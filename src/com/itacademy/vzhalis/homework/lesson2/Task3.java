package com.itacademy.vzhalis.homework.lesson2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пременную a:");
        int a = scanner.nextInt();

        System.out.println("Введите переменную b:");
        int b = scanner.nextInt();

        System.out.println("Введите переменную c:");
        int c = scanner.nextInt();

        int discriminant = getDiscriminant(a, b, c);

        if (isZero(discriminant)) {
            double x = (-b * 1.0) / (2 * a);
            System.out.println(x);
        } else if (isPositive(discriminant)) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1=" + x1 + " x2=" + x2);
        } else {
            System.out.println("Дискриминант отрицательный!");
        }
    }

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }

    public static int getDiscriminant(int a, int b, int c) {
        return b * b - 4 * a * c;
    }
}
