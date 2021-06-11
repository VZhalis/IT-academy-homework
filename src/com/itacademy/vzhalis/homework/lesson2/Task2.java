package com.itacademy.vzhalis.homework.lesson2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону первого дома:");
        int firstSideFirstHouse = scanner.nextInt();

        System.out.println("Введите вторую сторону первого дома:");
        int secondSideFirstHouse = scanner.nextInt();

        System.out.println("Введите первую сторону второго дома:");
        int firstSideSecondHouse = scanner.nextInt();

        System.out.println("Введите вторую сторону второго дома:");
        int secondSideSecondHouse = scanner.nextInt();

        System.out.println("Введите первую сторону участка:");
        int firstSideArea = scanner.nextInt();

        System.out.println("Введите вторую сторону участка:");
        int secondSideArea = scanner.nextInt();

        if ((isFirstGreater(firstSideArea, firstSideFirstHouse + firstSideSecondHouse)
                && isFirstGreater(secondSideArea, getGreater(secondSideFirstHouse, secondSideSecondHouse))
                || (isFirstGreater(secondSideArea, firstSideFirstHouse + firstSideSecondHouse)
                && isFirstGreater(firstSideArea, getGreater(secondSideFirstHouse, secondSideSecondHouse))))

                || (isFirstGreater(firstSideArea, firstSideFirstHouse + secondSideSecondHouse)
                && isFirstGreater(secondSideArea, getGreater(secondSideFirstHouse, firstSideSecondHouse))
                || (isFirstGreater(secondSideArea, firstSideFirstHouse + secondSideSecondHouse)
                && isFirstGreater(firstSideArea, getGreater(secondSideFirstHouse, firstSideSecondHouse))))

                || (isFirstGreater(firstSideArea, secondSideFirstHouse + firstSideSecondHouse)
                && isFirstGreater(secondSideArea, getGreater(firstSideFirstHouse, secondSideSecondHouse))
                || (isFirstGreater(secondSideArea, secondSideFirstHouse + firstSideSecondHouse)
                && isFirstGreater(firstSideArea, getGreater(firstSideFirstHouse, secondSideSecondHouse))))

                || (isFirstGreater(firstSideArea, secondSideFirstHouse + secondSideSecondHouse)
                && isFirstGreater(secondSideArea, getGreater(firstSideFirstHouse, firstSideSecondHouse))
                || (isFirstGreater(secondSideArea, secondSideFirstHouse + secondSideSecondHouse)
                && isFirstGreater(firstSideArea, getGreater(firstSideFirstHouse, firstSideSecondHouse))))) {
            System.out.println("ВОЗМОЖНО!");
        } else {
            System.out.println("НЕ ВОЗМОЖНО!");
        }
    }

    private static boolean isFirstGreater(int first, int second) {
        return first >= second;
    }

    private static int getGreater(int first, int second) {
        return first >= second
                ? first
                : second;
    }
}