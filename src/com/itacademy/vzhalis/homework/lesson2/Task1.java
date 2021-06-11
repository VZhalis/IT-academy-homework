package com.itacademy.vzhalis.homework.lesson2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int enteredYear = getEnteredYear(console);

        int enteredMonth = getEnteredMonth(console);

        int enteredDay = getEnteredDay(console, enteredMonth, enteredYear);

        System.out.println(nextDay(enteredYear, enteredMonth, enteredDay));
    }

    public static String nextDay(int enteredYear, int enteredMonth, int enteredDay) {
        int nextDay = enteredDay + 1;
        if (nextDay > getDaysInMonth(enteredMonth, enteredYear)) {
            if (enteredMonth + 1 > 12) {
                enteredYear = enteredYear + 1;
                enteredMonth = 0;
            }
            enteredMonth = enteredMonth + 1;
            nextDay = 1;
        }
        return nextDay + "." + enteredMonth + "." + enteredYear;
    }

    public static int getEnteredYear(Scanner scanner) {
        System.out.println("Введите год: ");
        int enteredYear = scanner.nextInt();
        return enteredYear >= 0
                ? enteredYear
                : getEnteredYear(scanner);
    }

    public static int getEnteredMonth(Scanner scanner) {
        System.out.println("Введите месяц: ");
        int enteredMonth = scanner.nextInt();
        return enteredMonth >= 1 && enteredMonth <= 12
                ? enteredMonth
                : getEnteredMonth(scanner);
    }

    public static int getEnteredDay(Scanner scanner, int enteredMonth, int enteredYear) {
        System.out.println("Введите день:");
        int enteredDay = scanner.nextInt();
        return enteredDay >= 1 && enteredDay <= getDaysInMonth(enteredMonth, enteredYear)
                ? enteredDay
                : getEnteredDay(scanner, enteredMonth, enteredYear);
    }

    public static int getDaysInMonth(int enteredMonth, int enteredYear) {
        return switch (enteredMonth) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            default -> isLeap(enteredYear)
                    ? 29
                    : 28;
        };
    }

    public static boolean isLeap(int enteredYear) {
        return enteredYear % 4 == 0 && enteredYear % 100 != 0 || enteredYear % 400 == 0;
    }
}



