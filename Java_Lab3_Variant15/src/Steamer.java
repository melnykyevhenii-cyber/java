public class Steamer extends Ship {
    private int enginePower; // потужність у к.с.
    private String fuelType; // тип палива

    public Steamer(String name, double displacement, double maxSpeed, int enginePower, String fuelType) {
        super(name, displacement, maxSpeed);
        this.enginePower = enginePower;
        this.fuelType = fuelType;
    }

    @Override
    public void Show() {
        System.out.printf("Пароплав: '%s' | Водотоннажність: %.1f т | Швидкість: %.1f вузлів | Потужність: %d к.с. | Паливо: %s%n",
                getName(), getDisplacement(), getMaxSpeed(), enginePower, fuelType);
    }
}
