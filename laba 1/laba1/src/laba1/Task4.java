package laba1;

import java.util.Scanner;

public class Task4 {
    public static void run(Scanner in) {
        System.out.println("\n--- ЗАВДАННЯ 4 (Варіант 12) ---");
        System.out.print("Введіть текст з клавіатури: ");
        String text = in.nextLine();

        String[] words = text.split("[,.:;?!\\s]+");
        if (words.length == 0 || (words.length == 1 && words[0].isEmpty())) {
            System.out.println("Введено порожній текст.");
            return;
        }

        int maxCount = -1;
        for (String word : words) {
            if (word.isEmpty()) continue;
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'A' || ch == 'а' || ch == 'А') {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println("Максимальна кількість входжень букви 'А'/'а': " + maxCount);
        System.out.println("Слова з найбільшою кількістю входжень:");
        for (String word : words) {
            if (word.isEmpty()) continue;
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'A' || ch == 'а' || ch == 'А') {
                    count++;
                }
            }
            if (count == maxCount) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }
}