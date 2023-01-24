package transport;

public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maximumSpeed;

    /**
     * Геттеры
     */
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * Сеттеры
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    /**
     * Конструктор
     */
    public Transport(String brand, String model, int year, String country, String color, int maximumSpeed) {
        this.brand = ValidateUtils.validateOfCarParameters(brand);
        this.model = ValidateUtils.validateOfCarParameters(model);
        this.year = ValidateUtils.validateOfCarYear(year);
        this.country = ValidateUtils.validateOfCarParameters(country);
        this.color = ValidateUtils.validateOfCarColor(color);
        this.maximumSpeed = ValidateUtils.validateOfMaximumSpeed(maximumSpeed);
    }
}
