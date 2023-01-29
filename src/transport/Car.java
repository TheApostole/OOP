package transport;

import java.text.DecimalFormat;

public class Car extends Transport {

//    private final String bodyType;
//    private final int numberOfSeats;
//    private double engineVolume;
//    private String transmission;
//    private String registrationNumber;
//    public boolean rubber;
//    private Key key;

//    /**
//     * Геттеры
//     */
//    public double getEngineVolume() {
//        return engineVolume;
//    }
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public boolean isRubber() {
//        return rubber;
//    }
//
//    /**
//     * Сеттеры
//     */
//    public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public void setRubber(boolean rubber) {
//        this.rubber = rubber;
//    }

    /**
     * Конструктор
     */
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

//    public Car(String brand, String model, int year, String country, String color, int maximumSpeed, double engineVolume,
//               String transmission, String bodyType, String registrationNumber, int numberOfSeats, Key key) {
//        super(brand, model, year, country, color, maximumSpeed);
//        this.engineVolume = ValidateUtils.validateOfCarEngineVolume(engineVolume);
//        this.transmission = ValidateUtils.validateOfCarParameters(transmission);
//        this.bodyType = ValidateUtils.validateOfCarParameters(bodyType);
//        this.registrationNumber = ValidateUtils.validateRegistrationNumber(registrationNumber);
//        this.numberOfSeats = ValidateUtils.validateOfCarNumberOfSeats(numberOfSeats);
//        this.key = key;
//    }

    /**
     * Методы
     */
    @Override
    void startMoving() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    void finishTheMovement() {
        System.out.println("Легковой автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп у легкового автомобиля " + getBrand() + " " + getModel());
    }

    @Override
    public void bestLapTime() {
        double min = 30.0;
        double max = 100.0;
        double bestLapTime = (min + (max - min) * Math.random());
        String formattedDouble = new DecimalFormat("#0.00").format(bestLapTime);
        System.out.println("Лучшее время круга у легкового автомобиля " + getBrand() + " " + getModel() + " в минутах: " + formattedDouble);
    }

    @Override
    public void maximumSpeed() {
        int min = 60;
        int max = 300;
        int bestLapTime = (int) (min + (max - min) * Math.random());
        System.out.println("Максимальная скорость легкового автомобиля" + getBrand() + " " + getModel() + " состовляет: " + bestLapTime);
    }

    public void print() {
        startMoving();
        bestLapTime();
        pitStop();
        maximumSpeed();
        finishTheMovement();
    }
}
