import java.util.Objects;

/**
 * Клас "Куб", який описує куб із заданим ребром.
 */
public class Cube {
    private double edge;

    private static int cubeCount = 0;

    // Блок ініціалізації
    {
        cubeCount++;
    }

    // Конструктори
    public Cube() {
        this.edge = 1.0;
    }

    public Cube(double edge) {
        if (edge <= 0) {
            throw new IllegalArgumentException("Ребро куба повинно бути додатним числом!");
        }
        this.edge = edge;
    }

    public static int getCubeCount() {
        return cubeCount;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        if (edge > 0) {
            this.edge = edge;
        } else {
            System.out.println("Помилка: ребро має бути > 0.");
        }
    }

    // Сумарна площа граней (6 * a^2)
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    // Об'єм куба (a^3)
    public double getVolume() {
        return Math.pow(edge, 3);
    }

    // Довжина великої діагоналі (a * sqrt(3))
    public double getDiagonal() {
        return edge * Math.sqrt(3);
    }

    @Override
    public String toString() {
        return String.format("Куб [Ребро = %.2f | Площа граней = %.2f | Об'єм = %.2f | Діагональ = %.2f]",
                edge, getSurfaceArea(), getVolume(), getDiagonal());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Double.compare(cube.edge, edge) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(edge);
    }
}
