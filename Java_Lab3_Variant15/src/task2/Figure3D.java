package task2;

public abstract class Figure3D {
    private String name;

    public Figure3D(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double getSurfaceArea();
    public abstract double getVolume();
}
