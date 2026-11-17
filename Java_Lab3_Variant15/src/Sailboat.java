public class Sailboat extends Ship {
    private int mastsCount;  // кількість щогл
    private double sailArea; // площа вітрил у м²

    public Sailboat(String name, double displacement, double maxSpeed, int mastsCount, double sailArea) {
        super(name, displacement, maxSpeed);
        this.mastsCount = mastsCount;
        this.sailArea = sailArea;
    }

    @Override
    public void Show() {
        System.out.printf("Вітрильник: '%s' | Водотоннажність: %.1f т | Швидкість: %.1f вузлів | Щогл: %d | Площа вітрил: %.1f м²%n",
                getName(), getDisplacement(), getMaxSpeed(), mastsCount, sailArea);
    }
}
