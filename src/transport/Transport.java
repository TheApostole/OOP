package transport;

import java.util.List;
import java.util.Objects;

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
    public Driver getDriver() {
        return driver;
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
    public void setDriver(Driver driver) {
        this.driver = driver;
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

   abstract boolean passDiagnostics() throws TransportTypeException;

    public boolean checksTheAdditionToTheQueue() {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }
    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Объём двигателя: " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && brand.equals(transport.brand) && model.equals(transport.model) && mechanics.equals(transport.mechanics) && driver.equals(transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, mechanics, driver);
    }
}

