package task3;

public class TriangularPyramid implements IFigure3D {
    private double baseSide;
    private double height;

    public TriangularPyramid(double baseSide, double height) {
        this.baseSide = baseSide;
        this.height = height;
    }

    private double getBaseArea() {
        return (Math.pow(baseSide, 2) * Math.sqrt(3)) / 4.0;
    }

    @Override
    public double getSurfaceArea() {
        double baseArea = getBaseArea();
        double inradius = (baseSide * Math.sqrt(3)) / 6.0;
        double apothem = Math.sqrt(height * height + inradius * inradius);
        double lateralArea = 1.5 * baseSide * apothem;
        return baseArea + lateralArea;
    }

    @Override
    public double getVolume() {
        return (1.0 / 3.0) * getBaseArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Трикутна піраміда [інтерфейс] (a=%.2f, h=%.2f) -> S = %.2f, V = %.2f",
                baseSide, height, getSurfaceArea(), getVolume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof TriangularPyramid)) return false;
        TriangularPyramid other = (TriangularPyramid) obj;
        return Double.compare(this.baseSide, other.baseSide) == 0 &&
               Double.compare(this.height, other.height) == 0;
    }
}
