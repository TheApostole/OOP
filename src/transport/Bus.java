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
    void start() {

    }

    @Override
    void finish() {

    }
}
//    public String toString() {
//        return "Марка: " + getBrand() + ", Модель: " + getModel() + ", Год выпуска: " + getYear()
//                + ", Страна производства: " + getCountry() + ", Цвет кузова: " + getColor()
//                + ", Максимальная скорость: " + getMaximumSpeed() + " км/ч";
//    }
