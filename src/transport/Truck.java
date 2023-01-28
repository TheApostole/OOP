package transport;

import java.text.DecimalFormat;

public class Truck extends Transport {

    /**
     * Конструктор
     */
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    /**
     * Методы
     */
    @Override
    void startMoving() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    void finishTheMovement() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у грузового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        double min = 50.0;
        double max = 160.0;
        double bestLapTime = (min + (max - min) * Math.random());
        String formattedDouble = new DecimalFormat("#0.00").format(bestLapTime);
        System.out.println("Лучшее время круга у грузового автомобиля " + getBrand() + " " + getModel() + " в минутах: " + formattedDouble);
    }

    @Override
    public void maximumSpeed() {
        int min = 20;
        int max = 140;
        int bestLapTime = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость грузового автомобиля" + getBrand() + " " + getModel() + " состовляет: " + bestLapTime);
    }

    public void print() {
        startMoving();
        bestLapTime();
        pitStop();
        maximumSpeed();
        finishTheMovement();
    }
}
