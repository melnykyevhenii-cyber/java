package lab1;

import java.util.Scanner;

public class Task3 {
    public static void run(Scanner in) {
        System.out.println("\n--- ЗАВДАННЯ 3 (Варіант 12) ---");
        System.out.print("Введіть розмірність квадратної матриці n (<=15): ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print("matrix[" + i + ", " + j + "] = ");
                matrix[i][j] = in.nextInt();
            }
        }

        System.out.println("\nВихідна матриця:");
        printMatrix(matrix);

        // Пошук максимального елемента
        int maxVal = matrix[0][0];
        int maxRow = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                    maxRow = i;
                }
            }
        }
        System.out.println("Максимальний елемент: " + maxVal + " (знаходиться у рядку " + maxRow + ")");

        // Зсув рядків
        int[][] tempMat = new int[n][n];
        for (int i = 0; i < n; i++) {
            int newRow = (i - maxRow + n) % n;
            tempMat[newRow] = matrix[i];
        }
        for (int i = 0; i < n; i++) {
            matrix[i] = tempMat[i];
        }

        System.out.println("Матриця після циклічного зсуву рядків:");
        printMatrix(matrix);
    }

    private static void printMatrix(int[][] a) {
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
