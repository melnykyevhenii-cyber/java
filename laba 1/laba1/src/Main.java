package lab1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("   ЛАБОРАТОРНА РОБОТА №1 (Варіант 12)");
            System.out.println("   (Завдання 1: Варіант 2)");
            System.out.println("========================================");
            System.out.println("1. Завдання 1 (Вираз)");
            System.out.println("2. Завдання 2 (Масив: від'ємні на початок)");
            System.out.println("3. Завдання 3 (Матриця: зсув рядків з макс. елементом)");
            System.out.println("4. Завдання 4 (Текст: слова з макс. кількістю 'А'/'а')");
            System.out.println("0. Вихід");
            System.out.print("Оберіть номер завдання (0-4): ");

            if (!in.hasNextInt()) {
                System.out.println("Помилка! Будь ласка, введіть число від 0 до 4.");
                in.next(); // очистити некоректне введення
                continue;
            }

            choice = in.nextInt();
            in.nextLine(); // очистити буфер після nextInt()

            switch (choice) {
                case 1:
                    Task1.run(in);
                    break;
                case 2:
                    Task2.run(in);
                    break;
                case 3:
                    Task3.run(in);
                    break;
                case 4:
                    Task4.run(in);
                    break;
                case 0:
                    System.out.println("Вихід з програми. До побачення!");
                    break;
                default:
                    System.out.println("Невірний вибір! Будь ласка, оберіть від 0 до 4.");
            }

        } while (choice != 0);

        in.close();
    }
}