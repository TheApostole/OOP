package transport;

import java.text.DecimalFormat;

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
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    void finishTheMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у автобуса " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        double min = 60.0;
        double max = 180.0;
        double bestLapTime = (min + (max - min) * Math.random());
        String formattedDouble = new DecimalFormat("#0.00").format(bestLapTime);
        System.out.println("Лучшее время круга у автобуса " + getBrand() + " " + getModel() + " в минутах: " + formattedDouble);
    }

    @Override
    public void maximumSpeed() {
        int min = 20;
        int max = 120;
        int bestLapTime = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость автобуса" + getBrand() + " " + getModel() + " состовляет: " + bestLapTime);
    }

    public void print() {
        startMoving();
        bestLapTime();
        pitStop();
        maximumSpeed();
        finishTheMovement();
    }
}
//    public String toString() {
//        return "Марка: " + getBrand() + ", Модель: " + getModel() + ", Год выпуска: " + getYear()
//                + ", Страна производства: " + getCountry() + ", Цвет кузова: " + getColor()
//                + ", Максимальная скорость: " + getMaximumSpeed() + " км/ч";
//    }
