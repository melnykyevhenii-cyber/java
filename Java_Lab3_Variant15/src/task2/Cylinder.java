package task2;

public class Cylinder extends Figure3D {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Циліндр");
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
        return String.format("%s (r=%.2f, h=%.2f) -> S = %.2f, V = %.2f",
                getName(), radius, height, getSurfaceArea(), getVolume());
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
