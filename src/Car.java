public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    public Car(String brand, String model, int year, String country, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.year = year;
        this.color = color;
        this.engineVolume = engineVolume;
        checks();
    }
    public void checks(){
        if(brand == null || brand.trim().isEmpty()) {
            this.brand = "default";
        }
        if (model == null || model.trim().isEmpty()){
            this.model = "default";
        }
        if (country == null || country.trim().isEmpty()) {
            this.country = "default";
        }
        if(year <= 0) {
            this.year = 2000;
        }
        if (color == null || color.trim().isEmpty()) {
            this.color = "белый";
        }
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
