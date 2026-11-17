package task3;

public class Cube implements IFigure3D {
    private double side;

    public Cube(double side) {
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
        return String.format("Куб [інтерфейс] (a=%.2f) -> S = %.2f, V = %.2f",
                side, getSurfaceArea(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cube)) return false;
        Cube other = (Cube) obj;
        return Double.compare(this.side, other.side) == 0;
    }
}
