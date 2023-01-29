package transport;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;

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

    /**
     * Сеттеры
     */
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    /**
     * Конструктор
     */
    public Transport(String brand, String model, double engineVolume) {
        this.brand = ValidateUtils.validateOfCarParameters(brand);
        this.model = ValidateUtils.validateOfCarParameters(model);
        this.engineVolume = ValidateUtils.validateOfCarEngineVolume(engineVolume);
    }

    /**
     * Методы
     */
   abstract void startMoving();

   abstract void finishTheMovement();

    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Объём двигателя: " + engineVolume;
    }
}
