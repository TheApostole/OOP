package transport;

public abstract class Transport implements Competing {
    private final String brand;
    private final String model;
    private double engineVolume;
//    private final int year;
//    private final String country;
//    private String color;
//    private int maximumSpeed;

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

//    public int getYear() {
//        return year;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getMaximumSpeed() {
//        return maximumSpeed;
//    }

    /**
     * Сеттеры
     */
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    //    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setMaximumSpeed(int maximumSpeed) {
//        this.maximumSpeed = maximumSpeed;
//    }

    /**
     * Конструктор
     */
    public Transport(String brand, String model, double engineVolume) {
        this.brand = ValidateUtils.validateOfCarParameters(brand);
        this.model = ValidateUtils.validateOfCarParameters(model);
        this.engineVolume = ValidateUtils.validateOfCarEngineVolume(engineVolume);
    }
//        this.year = ValidateUtils.validateOfCarYear(year);
//        this.country = ValidateUtils.validateOfCarParameters(country);
//        this.color = ValidateUtils.validateOfCarColor(color);
//        this.maximumSpeed = ValidateUtils.validateOfMaximumSpeed(maximumSpeed);

    /**
     * Методы
     */
   abstract void startMoving();

   abstract void finishTheMovement();

    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Объём двигателя: " + engineVolume;
    }
}
