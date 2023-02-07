package transport;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mechanic mechanicOleg = new Mechanic("Олег", "Ефремов", "«Железная булка»");
        Mechanic mechanicIgor = new Mechanic("Игорь", "Ефиров", "«Железная булка»");
        Mechanic mechanicSanek = new Mechanic("Александр", "Ефрамов", "«Хардкорный ремонт»");
        Mechanic mechanicAndrei = new Mechanic("Андрей", "Евдокий", "«Ремонт без границ»");


        DriverB<Car> driverB = new DriverB<>("Федотов Сергей Андреевич", true, 5);
        DriverB<Car> driverB2 = new DriverB<>("Федотов2 Сергей2 Андреевич2", true, 2);
        DriverB<Car> driverB3 = new DriverB<>("Федотов3 Сергей3 Андреевич3", true, 6);
        DriverB<Car> driverB4 = new DriverB<>("Федотов4 Сергей4 Андреевич4", true, 8);

        Car car = new Car("Audi", "A7 RS", 4.0, BodyType.TYPE3, driverB, List.of(mechanicIgor, mechanicOleg));
        Car car2 = new Car("BMW", "M5", 4.4, BodyType.TYPE1, driverB2, List.of(mechanicIgor));
        Car car3 = new Car("Nissan", "GT-R", 3.8, BodyType.TYPE3, driverB3, List.of(mechanicOleg));
        Car car4 = new Car("Mercedes-Benz", "AMG 63 AMG III",  4.0, null, driverB4, List.of(mechanicIgor));
        System.out.println(car);
        car.printType();
        car.passDiagnostics();
        System.out.println(car2);
        car2.printType();
        System.out.println(car3);
        car3.printType();
        System.out.println(car4);
        car4.printType();
        System.out.println("==================");
        car.print();
        System.out.println("==================");

        DriverD<Bus> driverD = new DriverD<>("Иванов Иван Иванович", true, 8);
        DriverD<Bus> driverD2 = new DriverD<>("Иванов2 Иван2 Иванович2", true, 5);
        DriverD<Bus> driverD3 = new DriverD<>("Иванов3 Иван3 Иванович3", true, 7);
        DriverD<Bus> driverD4 = new DriverD<>("Иванов4 Иван4 Иванович4", true, 10);

        Bus bus = new Bus("MAN", "Lion's Intercity", 9.00, Capacity.L, driverD, List.of(mechanicSanek));
        Bus bus2 = new Bus("Mercedes-Benz", "Sprinter II", 5.50, Capacity.S, driverD2, List.of(mechanicSanek));
        Bus bus3 = new Bus("Scania", "Omni", 12.00, Capacity.EL, driverD3, List.of(mechanicSanek));
        Bus bus4 = new Bus("Mercedes-Benz", "Sprinter I", 7.0, Capacity.ES, driverD4, List.of(mechanicSanek));
        System.out.println(bus);
        bus.printType();
        try {
            bus.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bus2);
        bus2.printType();
        try {
            bus2.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bus3);
        bus3.printType();
        try {
            bus3.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(bus4);
        bus4.printType();
        try {
            bus4.passDiagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("==================");
        bus.print();
        System.out.println("==================");


        DriverC<Truck> driverC = new DriverC<>("Михайлин Александр Викторович", true, 7);
        DriverC<Truck> driverC2 = new DriverC<>("Михайлин2 Александр2 Викторович2", true, 4);
        DriverC<Truck> driverC3 = new DriverC<>("Михайлин3 Александр3 Викторович3", true, 6);
        DriverC<Truck> driverC4 = new DriverC<>("Михайлин4 Александр4 Викторович4", true, 11);

        Truck trucks = new Truck("Isuzu", "Forward", 7.8, LoadCapacity.N1, driverC, List.of(mechanicAndrei));
        Truck trucks2 = new Truck("Scania", "P-Series", 12.7, LoadCapacity.N2, driverC2, List.of(mechanicAndrei));
        Truck trucks3 = new Truck("Volvo", "FE", 7.7, LoadCapacity.N3, driverC3, List.of(mechanicAndrei));
        Truck trucks4 = new Truck("КамАЗ", "5460", 11.8, null, driverC4, List.of(mechanicAndrei));
        System.out.println(trucks);
        trucks.printType();
        trucks.passDiagnostics();
        System.out.println(trucks2);
        trucks2.printType();
        System.out.println(trucks3);
        trucks3.printType();
        System.out.println(trucks4);
        trucks4.printType();
        System.out.println("==================");
        trucks.print();
        System.out.println("==================");

        System.out.println(driverB.receiveAndPrintInformation(car2));
        System.out.println(driverB2.receiveAndPrintInformation(car));
        System.out.println(driverB3.receiveAndPrintInformation(car3));
        System.out.println(driverB4.receiveAndPrintInformation(car4));
        System.out.println("==================");

        System.out.println(driverC.receiveAndPrintInformation(trucks));
        System.out.println(driverC2.receiveAndPrintInformation(trucks2));
        System.out.println(driverC3.receiveAndPrintInformation(trucks3));
        System.out.println(driverC4.receiveAndPrintInformation(trucks4));
        System.out.println("==================");

        System.out.println(driverD.receiveAndPrintInformation(bus));
        System.out.println(driverD2.receiveAndPrintInformation(bus2));
        System.out.println(driverD3.receiveAndPrintInformation(bus3));
        System.out.println(driverD4.receiveAndPrintInformation(bus4));
        System.out.println("==================");

        List<Transport> cars = new ArrayList<>();
        cars.add(car);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(trucks);
        cars.add(trucks2);
        cars.add(trucks3);
        cars.add(trucks4);
        cars.add(bus);
        cars.add(bus2);
        cars.add(bus3);
        cars.add(bus4);
        for (Transport j : cars) {
            System.out.println(j + ", " + j.getDriver() + ", " + j.getMechanics());
        }
        System.out.println("==================");
        Queue<Transport> transportSS = new ArrayDeque<>();
        ServiceStation serviceStation = new ServiceStation(transportSS);

        for(Transport transport : cars) {
            serviceStation.addACarToTheQueue(transport);
        }
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        serviceStation.addACarToTheQueue(car);
        serviceStation.addACarToTheQueue(car2);
        serviceStation.addACarToTheQueue(car3);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
        serviceStation.addACarToTheQueue(car4);
        System.out.println("==================");
        serviceStation.carryOutAVehicleInspection(transportSS);
    }
}