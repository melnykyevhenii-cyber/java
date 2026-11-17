public class Corvette extends Ship {
    private int weaponsCount; // кількість озброєння
    private int crewSize;     // чисельність екіпажу

    public Corvette(String name, double displacement, double maxSpeed, int weaponsCount, int crewSize) {
        super(name, displacement, maxSpeed);
        this.weaponsCount = weaponsCount;
        this.crewSize = crewSize;
    }

    @Override
    public void Show() {
        System.out.printf("Корвет: '%s' | Водотоннажність: %.1f т | Швидкість: %.1f вузлів | Озброєння: %d од. | Екіпаж: %d осіб%n",
                getName(), getDisplacement(), getMaxSpeed(), weaponsCount, crewSize);
    }
}
