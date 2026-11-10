import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean exit = false;

        while (!exit) {
            printMenu();
            System.out.print("Оберіть пункт меню (0-3): ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    testFraction();
                    break;
                case "2":
                    testCube();
                    break;
                case "3":
                    testMathUtils();
                    break;
                case "0":
                    exit = true;
                    System.out.println("Завершення роботи програми. До побачення!");
                    break;
                default:
                    System.out.println("Некоректний вибір! Спробуйте ще раз.\n");
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n========== ЛАБОРАТОРНА РОБОТА №2 ==========");
        System.out.println("1. Завдання 1: Робота з дробовими числами (Fraction)");
        System.out.println("2. Завдання 2: Робота з кубом (Cube)");
        System.out.println("3. Завдання 3: Обчислення НСД та НСК (MathUtils)");
        System.out.println("0. Вихід");
        System.out.println("=============================================");
    }

    // Тестування Завдання 1 з клавіатури
    private static void testFraction() {
        System.out.println("\n--- ТЕСТУВАННЯ: Клас Fraction ---");
        
        System.out.println("Введіть перше дробове число (ціла частина та дробова окремо):");
        System.out.print("Ціла частина (long): ");
        long i1 = Long.parseLong(scanner.nextLine());
        System.out.print("Дробова частина (short, наприклад 500 для 0.5): ");
        short f1 = Short.parseShort(scanner.nextLine());
        Fraction frac1 = new Fraction(i1, f1);

        System.out.println("\nВведіть друге дробове число як одне дійсне число (наприклад 2.25):");
        System.out.print("Число (double): ");
        double d2 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
        Fraction frac2 = new Fraction(d2);

        System.out.println("\n--- Результати ---");
        System.out.println("Перший дріб: " + frac1);
        System.out.println("Другий дріб: " + frac2);
        System.out.println("Сума (+): " + frac1.add(frac2));
        System.out.println("Різниця (-): " + frac1.subtract(frac2));
        System.out.println("Добуток (*): " + frac1.multiply(frac2));
        
        int cmp = frac1.compareTo(frac2);
        if (cmp > 0) System.out.println("Перший дріб більше за другий.");
        else if (cmp < 0) System.out.println("Перший дріб менше за другий.");
        else System.out.println("Дроби рівні.");

        System.out.println("Метод equals(): " + frac1.equals(frac2));
        System.out.println("Створено об'єктів Fraction: " + Fraction.getInstanceCount());
    }

    // Тестування Завдання 2 з клавіатури
    private static void testCube() {
        System.out.println("\n--- ТЕСТУВАННЯ: Клас Cube ---");

        try {
            System.out.print("Введіть довжину ребра першого куба: ");
            double a1 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
            Cube cube1 = new Cube(a1);

            System.out.print("Введіть довжину ребра другого куба: ");
            double a2 = Double.parseDouble(scanner.nextLine().replace(',', '.'));
            Cube cube2 = new Cube(a2);

            System.out.println("\n--- Результати ---");
            System.out.println("Перший куб: " + cube1);
            System.out.println("Другий куб: " + cube2);
            System.out.println("Порівняння (equals): " + cube1.equals(cube2));
            System.out.println("Створено об'єктів Cube: " + Cube.getCubeCount());

        } catch (IllegalArgumentException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }

    // Тестування Завдання 3 з клавіатури
    private static void testMathUtils() {
        System.out.println("\n--- ТЕСТУВАННЯ: Клас MathUtils ---");

        System.out.print("Введіть перше ціле число: ");
        long num1 = Long.parseLong(scanner.nextLine());
        System.out.print("Введіть друге ціле число: ");
        long num2 = Long.parseLong(scanner.nextLine());

        System.out.println("\n--- Результати ---");
        System.out.println("Найбільший спільний дільник (НСД / GCD): " + MathUtils.gcd(num1, num2));
        System.out.println("Найменше спільне кратне (НСК / LCM): " + MathUtils.lcm(num1, num2));
    }
}
