public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;


    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", год выпуска: " + year
                + ", страна производства: " + country + ", цвет кузова: " + color
                + ", объём двигателя: " + engineVolume;
    }
}
