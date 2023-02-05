package transport;

import java.util.List;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private List<Mechanic> mechanics;
    private Driver driver;

    /**
     * Геттеры
     */
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public double getEngineVolume() {
       return engineVolume;
   }
    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    /**
     * Сеттеры
     */
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    /**
     * Конструктор
     */
    public Transport(String brand, String model, double engineVolume, List<Mechanic> mechanics, Driver driver) {
        this.brand = ValidateUtils.validateOfCarParameters(brand);
        this.model = ValidateUtils.validateOfCarParameters(model);
        this.engineVolume = ValidateUtils.validateOfCarEngineVolume(engineVolume);
        this.mechanics = mechanics;
        this.driver = driver;
    }

    /**
     * Методы
     */
   abstract void startMoving();

   abstract void finishTheMovement();

   abstract void printType();

   abstract void passDiagnostics() throws TransportTypeException;

    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Объём двигателя: " + engineVolume + ", " + driver + ", " + mechanics;
    }
}
