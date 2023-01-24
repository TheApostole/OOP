package transport;

public class Bus extends Transport {

    /**
     * Конструктор
     */
    public Bus(String brand, String model, int year, String country, String color, int maximumSpeed) {
        super(brand, model, year, country, color, maximumSpeed);
    }

    /**
     * Методы
     */
    public String toString() {
        return "Марка: " + getBrand() + ", Модель: " + getModel() + ", Год выпуска: " + getYear()
                + ", Страна производства: " + getCountry() + ", Цвет кузова: " + getColor()
                + ", Максимальная скорость: " + getMaximumSpeed() + " км/ч";
    }
}
