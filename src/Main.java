public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.brand = "Lada";
        car.model = "Granta";
        car.year = 2015;
        car.country = "Россия";
        car.color = "желтый";
        car.engineVolume = 1.7;
        System.out.println(car);

        car.brand = "Audi";
        car.model = "A8 50L TDI quattro";
        car.year = 2020;
        car.country = "Германия";
        car.color = "чёрный";
        car.engineVolume = 3.0;
        System.out.println(car);

        car.brand = "BMW";
        car.model = "Z8";
        car.year = 2021;
        car.country = "Германия";
        car.color = "чёрный";
        car.engineVolume = 3.0;
        System.out.println(car);

        car.brand = "Kia";
        car.model = "Sportage 4-го поколения";
        car.year = 2018;
        car.country = "Южная Корея";
        car.color = "красный";
        car.engineVolume = 2.4;
        System.out.println(car);

        car.brand = "Hyundai";
        car.model = "Avante";
        car.year = 2016;
        car.country = "Южная Корея";
        car.color = "оранжевый";
        car.engineVolume = 1.6;
        System.out.println(car);
    }

}