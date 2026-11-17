package task2;

public class Cube extends Figure3D {
    private double side;

    public Cube(double side) {
        super("Куб");
        this.side = side;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return String.format("%s (a=%.2f) -> S = %.2f, V = %.2f",
                getName(), side, getSurfaceArea(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cube)) return false;
        Cube other = (Cube) obj;
        return Double.compare(this.side, other.side) == 0;
    }
}
