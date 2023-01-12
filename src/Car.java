public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;


    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", год выпуска: " + year
                + ", страна производства: " + country + ", цвет кузова: " + color
                + ", объём двигателя: " + engineVolume;
    }
}
