package transport;

public class Bus extends Transport {

    /**
     * Конструктор
     */
    public Bus(String brand, String model, double engineVolume) {
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
//    public String toString() {
//        return "Марка: " + getBrand() + ", Модель: " + getModel() + ", Год выпуска: " + getYear()
//                + ", Страна производства: " + getCountry() + ", Цвет кузова: " + getColor()
//                + ", Максимальная скорость: " + getMaximumSpeed() + " км/ч";
//    }
