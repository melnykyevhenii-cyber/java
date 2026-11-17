public class Ship {
    private String name;
    private double displacement; // водотоннажність у тоннах
    private double maxSpeed;     // швидкість у вузлах

    public Ship(String name, double displacement, double maxSpeed) {
        this.name = name;
        this.displacement = displacement;
        this.maxSpeed = maxSpeed;
    }

    public String getName() { return name; }
    public double getDisplacement() { return displacement; }
    public double getMaxSpeed() { return maxSpeed; }

    public void Show() {
        System.out.printf("Корабель: '%s' | Водотоннажність: %.1f т | Макс. швидкість: %.1f вузлів%n",
                name, displacement, maxSpeed);
    }
}
