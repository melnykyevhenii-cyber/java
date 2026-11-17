package task3;

public class Sphere implements IFigure3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format("Сфера [інтерфейс] (r=%.2f) -> S = %.2f, V = %.2f",
                radius, getSurfaceArea(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Sphere)) return false;
        Sphere other = (Sphere) obj;
        return Double.compare(this.radius, other.radius) == 0;
    }
}
