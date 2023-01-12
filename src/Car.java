public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        if(brand == null || brand.trim().isEmpty()) {
            this.brand = "default";
        }
        this.model = model;
        if (model == null || model.trim().isEmpty()){
            this.model = "default";
        }
        this.country = country;
        if (country == null || country.trim().isEmpty()) {
            this.country = "default";
        }
        this.year = year;
        if(year <= 0) {
            this.year = 2000;
        }
        this.color = color;
        if (color == null || color.trim().isEmpty()) {
            this.color = "белый";
        }
        this.engineVolume = engineVolume;
        if(engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
    }
    @Override
    public String toString() {
        return "Марка: " + brand + ", модель: " + model + ", год выпуска: " + year
                + ", страна производства: " + country + ", цвет кузова: " + color
                + ", объём двигателя: " + engineVolume;
    }
}
