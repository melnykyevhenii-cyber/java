import java.util.Scanner;
import task2.Figure3D;
import task3.IFigure3D;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Лабораторна робота №3 (Варіант 15) ===");
            System.out.println("1. Завдання 1: Ієрархія кораблів (введення + вивід)");
            System.out.println("2. Завдання 2: Абстрактний клас Figure3D");
            System.out.println("3. Завдання 3: Інтерфейс IFigure3D");
            System.out.println("0. Вихід");
            System.out.print("Ваш вибір: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Будь ласка, введіть число.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine(); // очищення буфера

            if (choice == 0) {
                System.out.println("Роботу завершено.");
                break;
            }

            switch (choice) {
                case 1 -> runTask1(scanner);
                case 2 -> runTask2();
                case 3 -> runTask3();
                default -> System.out.println("Невірний вибір. Спробуйте ще раз.");
            }
        }
        scanner.close();
    }

    private static void runTask1(Scanner scanner) {
        System.out.print("\nСкільки суден додати до масиву? (введіть 0 для тестового набору): ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Ship[] fleet;

        if (n <= 0) {
            fleet = new Ship[]{
                new Ship("Альбатрос", 1200.0, 18.5),
                new Steamer("Титанік", 52310.0, 23.0, 46000, "Вугілля"),
                new Sailboat("Крузенштерн", 4700.0, 17.4, 4, 3400.0),
                new Corvette("Гетьман Іван Мазепа", 2400.0, 29.0, 12, 106)
            };
        } else {
            fleet = new Ship[n];
            for (int i = 0; i < n; i++) {
                System.out.printf("\nСудно #%d (1 - Корабель, 2 - Пароплав, 3 - Вітрильник, 4 - Корвет): ", i + 1);
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Назва: ");
                String name = scanner.nextLine();
                System.out.print("Водотоннажність (т): ");
                double disp = scanner.nextDouble();
                System.out.print("Макс. швидкість (вузлів): ");
                double speed = scanner.nextDouble();

                switch (type) {
                    case 2 -> {
                        System.out.print("Потужність двигуна (к.с.): ");
                        int power = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Тип палива: ");
                        String fuel = scanner.nextLine();
                        fleet[i] = new Steamer(name, disp, speed, power, fuel);
                    }
                    case 3 -> {
                        System.out.print("Кількість щогл: ");
                        int masts = scanner.nextInt();
                        System.out.print("Площа вітрил (м²): ");
                        double area = scanner.nextDouble();
                        fleet[i] = new Sailboat(name, disp, speed, masts, area);
                    }
                    case 4 -> {
                        System.out.print("Кількість озброєння: ");
                        int weapons = scanner.nextInt();
                        System.out.print("Чисельність екіпажу: ");
                        int crew = scanner.nextInt();
                        fleet[i] = new Corvette(name, disp, speed, weapons, crew);
                    }
                    default -> fleet[i] = new Ship(name, disp, speed);
                }
            }
        }

        System.out.println("\n--- Список суден у масиві ---");
        for (Ship ship : fleet) {
            ship.Show();
        }
    }

    private static void runTask2() {
        System.out.println("\n--- Завдання 2: Абстрактний клас Figure3D ---");
        Figure3D[] figures = {
            new task2.Cube(4.0),
            new task2.Sphere(3.0),
            new task2.Cone(3.0, 5.0),
            new task2.Cylinder(2.5, 6.0),
            new task2.TriangularPyramid(4.0, 6.0)
        };

        for (Figure3D fig : figures) {
            System.out.println(fig.toString());
        }

        task2.Cube c1 = new task2.Cube(4.0);
        task2.Cube c2 = new task2.Cube(4.0);
        task2.Cube c3 = new task2.Cube(5.0);
        System.out.println("Перевірка equals(): Cube(4) == Cube(4) -> " + c1.equals(c2));
        System.out.println("Перевірка equals(): Cube(4) == Cube(5) -> " + c1.equals(c3));
    }

    private static void runTask3() {
        System.out.println("\n--- Завдання 3: Інтерфейс IFigure3D ---");
        IFigure3D[] figures = {
            new task3.Cube(4.0),
            new task3.Sphere(3.0),
            new task3.Cone(3.0, 5.0),
            new task3.Cylinder(2.5, 6.0),
            new task3.TriangularPyramid(4.0, 6.0)
        };

        for (IFigure3D fig : figures) {
            System.out.println(fig.toString());
        }

        task3.Sphere s1 = new task3.Sphere(3.0);
        task3.Sphere s2 = new task3.Sphere(3.0);
        System.out.println("Перевірка equals(): Sphere(3) == Sphere(3) -> " + s1.equals(s2));
    }
}
