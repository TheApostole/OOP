package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("lada ", "", 2015, "Россия", "желтый", 1.7,
                " ", "седан", "", 5, new Car.Key(false, false));
        Car car2 = new Car("Audi", "A8 50L TDI quattro", 2020, "Германия", "чёрный", 3.0,
                " ", "седан", "А152УК77", 5, new Car.Key(true, true));
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0,
                " ", "седан", "А342ПК777", 5, new Car.Key(false, true));
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4,
                " ", "седан", "А162ЛП77", 5, new Car.Key(false, true));
        Car car5 = new Car("", "", 0, "", "", 0,
                " ", "седан", "Д389ПД77", 5, new Car.Key(true, false));
        car.typeOfRubber(11);
        car2.typeOfRubber(11);
        car3.typeOfRubber(6);
        car4.typeOfRubber(9);
        car5.typeOfRubber(2);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}