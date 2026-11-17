package task3;

public class Cone implements IFigure3D {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return String.format("Конус [інтерфейс] (r=%.2f, h=%.2f) -> S = %.2f, V = %.2f",
                radius, height, getSurfaceArea(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cone)) return false;
        Cone other = (Cone) obj;
        return Double.compare(this.radius, other.radius) == 0 &&
               Double.compare(this.height, other.height) == 0;
    }
}
