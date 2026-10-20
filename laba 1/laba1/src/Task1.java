package lab1;

import java.util.Scanner;

public class Task1 {
    public static void run(Scanner in) {
        System.out.println("\n--- ЗАВДАННЯ 1 (Варіант 2) ---");
        System.out.println("Вираз: 1/(xy) + 1/(x^2 + y^2) * (x - y)");

        System.out.println("\n1) Вхідні дані дійсного типу, результат дійсного:");
        System.out.print("Введіть x (double): ");
        double x1 = in.nextDouble();
        System.out.print("Введіть y (double): ");
        double y1 = in.nextDouble();
        if (x1 * y1 == 0 || (x1 * x1 + y1 * y1) == 0) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double res1 = (1.0 / (x1 * y1)) + (1.0 / (x1 * x1 + y1 * y1)) * (x1 - y1);
            System.out.println("Результат (double): " + res1);
        }

        System.out.println("\n2) Вхідні дані цілого типу, результат дійсного:");
        System.out.print("Введіть x (int): ");
        int x2 = in.nextInt();
        System.out.print("Введіть y (int): ");
        int y2 = in.nextInt();
        if (x2 * y2 == 0 || (x2 * x2 + y2 * y2) == 0) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double res2 = (1.0 / (x2 * y2)) + (1.0 / (double)(x2 * x2 + y2 * y2)) * (x2 - y2);
            System.out.println("Результат (double): " + res2);
        }

        System.out.println("\n3) Вхідні дані дійсного типу, результат цілого:");
        System.out.print("Введіть x (double): ");
        double x3 = in.nextDouble();
        System.out.print("Введіть y (double): ");
        double y3 = in.nextDouble();
        if (x3 * y3 == 0 || (x3 * x3 + y3 * y3) == 0) {
            System.out.println("Помилка: ділення на нуль!");
        } else {
            double calc = (1.0 / (x3 * y3)) + (1.0 / (x3 * x3 + y3 * y3)) * (x3 - y3);
            int res3 = (int) calc;
            System.out.println("Результат (int): " + res3);
        }
    }
}

