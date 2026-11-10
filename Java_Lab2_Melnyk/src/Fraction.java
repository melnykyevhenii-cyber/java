import java.util.Objects;

/**
 * Клас для роботи з дробовими числами.
 * Ціла частина - long, дробова - short.
 */
public class Fraction {
    private long integerPart;
    private short fractionalPart; // Зберігається у тисячних (наприклад, 500 = 0.500)

    private static int instanceCount = 0;
    public static final short SCALE = 1000;

    // Блок ініціалізації
    {
        instanceCount++;
    }

    // Конструктори
    public Fraction() {
        this.integerPart = 0;
        this.fractionalPart = 0;
    }

    public Fraction(long integerPart, short fractionalPart) {
        this.integerPart = integerPart;
        this.fractionalPart = (short) Math.abs(fractionalPart % SCALE);
    }

    public Fraction(double val) {
        this.integerPart = (long) val;
        this.fractionalPart = (short) Math.round(Math.abs(val - this.integerPart) * SCALE);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public double toDouble() {
        double frac = (double) fractionalPart / SCALE;
        return integerPart >= 0 ? integerPart + frac : integerPart - frac;
    }

    public Fraction add(Fraction other) {
        return new Fraction(this.toDouble() + other.toDouble());
    }

    public Fraction subtract(Fraction other) {
        return new Fraction(this.toDouble() - other.toDouble());
    }

    public Fraction multiply(Fraction other) {
        return new Fraction(this.toDouble() * other.toDouble());
    }

    public int compareTo(Fraction other) {
        return Double.compare(this.toDouble(), other.toDouble());
    }

    @Override
    public String toString() {
        return String.format("%d,%03d", integerPart, Math.abs(fractionalPart));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return integerPart == fraction.integerPart && fractionalPart == fraction.fractionalPart;
    }

    @Override
    public int hashCode() {
        return Objects.hash(integerPart, fractionalPart);
    }
}
