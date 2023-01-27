package transport;

import transport.Car;

public class Main {
    public static void main(String[] args) {

//        Car car = new Car("lada ", "", 2015, "Россия", "желтый", 180, 1.7,
//                " ", "седан", "", 5, new Car.Key(false, false));
//        Car car2 = new Car("Audi", "A8 50L TDI quattro", 2020, "Германия", "чёрный", 250, 3.0,
//                " ", "седан", "А152УК77", 5, new Car.Key(true, true));
//        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 250,3.0,
//                " ", "седан", "А342ПК777", 5, new Car.Key(false, true));
//        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 220,2.4,
//                " ", "седан", "А162ЛП77", 5, new Car.Key(false, true));
//        Car car5 = new Car("", "", 0, "", "", 0, 0,
//                " ", " ","Д389ПД77" , 5, new Car.Key(true, false));
//        car.typeOfRubber(11);
//        car2.typeOfRubber(11);
//        car3.typeOfRubber(6);
//        car4.typeOfRubber(9);
//        car5.typeOfRubber(2);
        Car car = new Car("Audi", "A7 RS", 4.0);
        Car car2 = new Car("BMW", "M5", 4.4);
        Car car3 = new Car("Nissan", "", 3.8);
        Car car4 = new Car("Mercedes-Benz", "AMG 63 AMG III", 4.0);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
//        System.out.println(car5);

//        Bus bus = new Bus("MAN", "Lion's Intercity", 2018, "Германия", "белый", 85);
//        Bus bus1 = new Bus("Mercedes-Benz", "Sprinter II", 2021, "Германия", "серебристый", 140);
//        Bus bus2 = new Bus("Scania", "Omni", 2004, "Швеция", "белый", 100);

        Bus bus = new Bus("MAN", "Lion's Intercity", 9.0);
        Bus bus2 = new Bus("Mercedes-Benz", "Sprinter II", 5.5);
        Bus bus3 = new Bus("Scania", "Omni", 12.0);
        Bus bus4 = new Bus("Mercedes-Benz", "Sprinter I", 7.0);
        System.out.println(bus);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);



        Trucks trucks = new Trucks("Isuzu", "Forward", 7.8);
        Trucks trucks2 = new Trucks("Scania", "P-Series", 12.7);
        Trucks trucks3 = new Trucks("Volvo", "FE", 7.7);
        Trucks trucks4 = new Trucks("КамАЗ", "5460", 11.8);
        System.out.println(trucks);
        System.out.println(trucks2);
        System.out.println(trucks3);
        System.out.println(trucks4);
    }
}