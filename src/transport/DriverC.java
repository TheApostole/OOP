package transport;

public class DriverC<T extends Truck> extends Driver {

    /**
     * Конструктор
     */
    public DriverC(String fIODriver, boolean thePresenceOfADriverLicense, int experience) {
        super(fIODriver, thePresenceOfADriverLicense, experience);
    }

    /**
     * Методы
     */
    @Override
    void startMoving() {
        System.out.println("Водитель категории C " + getfIODriver() + " начал движение");
    }

    @Override
    void finishTheMovement() {
        System.out.println("Водитель категории C " + getfIODriver() + " закончил движение");
    }

    @Override
    void refuelTheCar() {
        System.out.println("Водитель категории C " + getfIODriver() + " заправляет автомобиль");
    }
    public String receiveAndPrintInformation(T Truck) {
        return "Водитель " + getfIODriver() + " управляет грузовым автомобилем " + Truck.getBrand() + " " + Truck.getModel() + " и будет участвовать в заезде";
    }
}
