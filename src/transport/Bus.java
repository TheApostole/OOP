package transport;

import java.text.DecimalFormat;

public class Bus extends Transport {

   private Capacity capacity;

    /**
     * Геттер
     */
    public Capacity getCapacity() {
        return capacity;
    }

    /**
     * Сеттер
     */
    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    /**
     * Конструктор
     */
    public Bus(String brand, String model, double engineVolume, boolean diagnostics, Capacity capacity) {
        super(brand, model, engineVolume, diagnostics);
        this.setCapacity(capacity);
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

    void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacity());
        }
    }

    @Override
    void passDiagnostics() {
            try {
                throw new TransportTypeException("Автобусы диагностику проходить не должны!");
            } catch (TransportTypeException r) {
                System.out.println("Диагностику проходить не нужно!!!");
            }
    }
}
