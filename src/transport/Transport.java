package transport;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
    private boolean diagnostics;





    /**
     * Геттеры
     */
    public boolean isDiagnostics() {
        return diagnostics;
    }
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
    public void setDiagnostics(boolean diagnostics) {
        this.diagnostics = diagnostics;
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    /**
     * Конструктор
     */
    public Transport(String brand, String model, double engineVolume, boolean diagnostics) {
        this.brand = ValidateUtils.validateOfCarParameters(brand);
        this.model = ValidateUtils.validateOfCarParameters(model);
        this.engineVolume = ValidateUtils.validateOfCarEngineVolume(engineVolume);
        this.diagnostics =diagnostics;
    }

    /**
     * Методы
     */
   abstract void startMoving();

   abstract void finishTheMovement();

   abstract void printType();

   abstract void passDiagnostics() throws TransportTypeException;

    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Объём двигателя: " + engineVolume;
    }
}
