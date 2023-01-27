package transport;

public class Trucks extends Transport {

    /**
     * Конструктор
     */
    public Trucks (String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    /**
     * Методы
     */
    @Override
    void startMoving() {
        System.out.println("===СТАРТ===");
    }

    @Override
    void finishTheMovement() {
        System.out.println("===ФИНИШ===");
    }

    @Override
    public void pitStop() {
        System.out.println("Время «Пит-стоп»");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга");
    }

    @Override
    public void maximumSpeed() {
        System.out.println("Максимальная скорость");
    }
}
