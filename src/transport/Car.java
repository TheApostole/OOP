package transport;

import java.util.regex.Pattern;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private final String bodyType;
    private final int numberOfSeats;
    private String color;
    private double engineVolume;
    private String transmission;
    private String registrationNumber;
    public boolean rubber;

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

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean isRubber() {
        return rubber;
    }

    /**
     * Сеттеры
     */
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setRubber(boolean rubber) {
        this.rubber = rubber;
    }

    /**
     *Конструктор
     */
    public Car(String brand, String model, int year, String country, String color, double engineVolume,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats) {
        this.brand = validateOfCarParameters(brand);
        this.model = validateOfCarParameters(model);
        this.engineVolume = validateOfCarEngineVolume(engineVolume);
        this.color = validateOfCarColor(color);
        this.year = validateOfCarYear(year);
        this.country = validateOfCarParameters(country);
        this.transmission = validateOfCarParameters(transmission);
        this.bodyType = validateOfCarParameters(bodyType);
        this.registrationNumber = validateRegistrationNumber(registrationNumber);
        this.numberOfSeats = validateOfCarNumberOfSeats(numberOfSeats);
    }

    /**
     *Проверки
     */
    public static String validateOfCarParameters (String parameter) {
        if(parameter == null || parameter.trim().isEmpty()) {
            parameter = "Default";
        }
        return parameter;
    }
    public static String validateOfCarColor (String parameter) {
        if(parameter == null || parameter.trim().isEmpty()) {
            parameter = "белый";
        }
        return parameter;
    }
    public static int validateOfCarYear (Integer parameter) {
        if(parameter <= 1769 || parameter == null) {
            parameter = 2000;
        }
        return parameter;
    }
    public static double validateOfCarEngineVolume (Double parameter) {
        if(parameter <= 0 || parameter == null) {
            parameter = 1.5;
        }
        return parameter;
    }
    public static int validateOfCarNumberOfSeats (Integer parameter) {
        if(parameter < 2 || parameter > 7 || parameter == null) {
            parameter = 5;
        }
        return parameter;
    }
    public static String validateRegistrationNumber(String number) {
        if (Pattern.matches("[А-Я][0-9]{3}[А-Я]{2}[0-9]{2,3}", number)) {
            return number;
        }
        return "Некорректный номер";
    }

    /**
     *Методы
     */
    public void typeOfRubber (int month) {
        if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            rubber = true;
        }
        if ((month >= 5 && month <= 10)) {
            rubber = false;
        }
    }
    public String outputOfTheAttribute(){
        if (!rubber) {
            return " летняя";
        }
        return " зимняя";
    }
    @Override
    public String toString() {
        return "Марка: " + brand + ", Модель: " + model + ", Год выпуска: " + year
                + ", Страна производства: " + country + ", Цвет кузова: " + color
                + ", Объём двигателя: " + engineVolume + ", Коробка передач: " + transmission
                + ", Тип кузова: " + bodyType + ", Регистрационный номер: " + registrationNumber + ", Количество мест: " + numberOfSeats + ", Резина:" + outputOfTheAttribute();
    }
}
