package task3;

public class Cylinder implements IFigure3D {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Циліндр [інтерфейс] (r=%.2f, h=%.2f) -> S = %.2f, V = %.2f",
                radius, height, getSurfaceArea(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cylinder)) return false;
        Cylinder other = (Cylinder) obj;
        return Double.compare(this.radius, other.radius) == 0 &&
               Double.compare(this.height, other.height) == 0;
    }
}
