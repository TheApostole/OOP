package transport;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Audi", "A7 RS", 4.0);
        Car car2 = new Car("BMW", "M5", 4.4);
        Car car3 = new Car("Nissan", "GT-R", 3.8);
        Car car4 = new Car("Mercedes-Benz", "AMG 63 AMG III", 4.0);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println("==================");
        car.print();
        System.out.println("==================");

        Bus bus = new Bus("MAN", "Lion's Intercity", 9.0);
        Bus bus2 = new Bus("Mercedes-Benz", "Sprinter II", 5.5);
        Bus bus3 = new Bus("Scania", "Omni", 12.0);
        Bus bus4 = new Bus("Mercedes-Benz", "Sprinter I", 7.0);
        System.out.println(bus);
        System.out.println(bus2);
        System.out.println(bus3);
        System.out.println(bus4);
        System.out.println("==================");
        bus.print();
        System.out.println("==================");

        Truck trucks = new Truck("Isuzu", "Forward", 7.8);
        Truck trucks2 = new Truck("Scania", "P-Series", 12.7);
        Truck trucks3 = new Truck("Volvo", "FE", 7.7);
        Truck trucks4 = new Truck("КамАЗ", "5460", 11.8);
        System.out.println(trucks);
        System.out.println(trucks2);
        System.out.println(trucks3);
        System.out.println(trucks4);
        System.out.println("==================");
        trucks.print();
        System.out.println("==================");

        DriverB<Car> driverB = new DriverB<>("Федотов Сергей Андреевич", true, 5);
        DriverB<Car> driverB2 = new DriverB<>("Федотов2 Сергей2 Андреевич2", true, 2);
        DriverB<Car> driverB3 = new DriverB<>("Федотов3 Сергей3 Андреевич3", true, 6);
        DriverB<Car> driverB4 = new DriverB<>("Федотов4 Сергей4 Андреевич4", true, 8);
        System.out.println(driverB.receiveAndPrintInformation(car2));
        System.out.println(driverB2.receiveAndPrintInformation(car));
        System.out.println(driverB3.receiveAndPrintInformation(car3));
        System.out.println(driverB4.receiveAndPrintInformation(car4));
        System.out.println("==================");

        DriverC<Truck> driverC = new DriverC<>("Михайлин Александр Викторович", true, 7);
        DriverC<Truck> driverC2 = new DriverC<>("Михайлин2 Александр2 Викторович2", true, 4);
        DriverC<Truck> driverC3 = new DriverC<>("Михайлин3 Александр3 Викторович3", true, 6);
        DriverC<Truck> driverC4 = new DriverC<>("Михайлин4 Александр4 Викторович4", true, 11);
        System.out.println(driverC.receiveAndPrintInformation(trucks));
        System.out.println(driverC2.receiveAndPrintInformation(trucks2));
        System.out.println(driverC3.receiveAndPrintInformation(trucks3));
        System.out.println(driverC4.receiveAndPrintInformation(trucks4));
        System.out.println("==================");

        DriverD<Bus> driverD = new DriverD<>("Иванов Иван Иванович", true, 8);
        DriverD<Bus> driverD2 = new DriverD<>("Иванов2 Иван2 Иванович2", true, 5);
        DriverD<Bus> driverD3 = new DriverD<>("Иванов3 Иван3 Иванович3", true, 7);
        DriverD<Bus> driverD4 = new DriverD<>("Иванов4 Иван4 Иванович4", true, 10);
        System.out.println(driverD.receiveAndPrintInformation(bus));
        System.out.println(driverD2.receiveAndPrintInformation(bus2));
        System.out.println(driverD3.receiveAndPrintInformation(bus3));
        System.out.println(driverD4.receiveAndPrintInformation(bus4));
    }
}