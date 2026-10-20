package laba1;

import java.util.Scanner;

public class Task2 {
    public static void run(Scanner in) {
        System.out.println("\n--- ЗАВДАННЯ 2 (Варіант 12) ---");
        System.out.print("Введіть розмірність масиву n (<=400): ");
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            System.out.print("a[" + i + "] = ");
            a[i] = in.nextInt();
        }

        System.out.println("\nВихідний масив:");
        printArray(a);

        // Перетворення масиву: від'ємні на початок
        int lastNeg = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                int temp = a[i];
                for (int j = i; j > lastNeg; j--) {
                    a[j] = a[j - 1];
                }
                a[lastNeg] = temp;
                lastNeg++;
            }
        }

        System.out.println("Перетворений масив (по 10 елементів у рядку):");
        printArray(a);
    }

    private static void printArray(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + "\t");
            count++;
            if (count == 10) {
                System.out.println();
                count = 0;
            }
        }
        if (count != 0) {
            System.out.println();
        }
    }
}
