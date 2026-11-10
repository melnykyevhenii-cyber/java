/**
 * Клас для обчислення НСД та НСК двох натуральних чисел.
 */
public class MathUtils {

    // Пошук найбільшого спільного дільника (Алгоритм Евкліда)
    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Пошук найменшого спільного кратного
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd(a, b);
    }
}
