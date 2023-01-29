package transport;

public class DriverB <T extends Car> extends Driver {

    /**
     * Конструктор
     */
    public DriverB(String fIODriver, boolean thePresenceOfADriverLicense, int experience) {
        super(fIODriver, thePresenceOfADriverLicense, experience);
    }

    /**
     * Методы
     */
    @Override
    void startMoving() {
        System.out.println("Водитель категории B " + getfIODriver() + " начал движение");
    }

    @Override
    void finishTheMovement() {
        System.out.println("Водитель категории B " + getfIODriver() + " закончил движение");
    }

    @Override
    void refuelTheCar() {
        System.out.println("Водитель категории B " + getfIODriver() + " заправляет автомобиль");
    }
    public String receiveAndPrintInformation(T Car) {
        return "Водитель " + getfIODriver() + " управляет автомобилем " + Car.getBrand() + " " + Car.getModel() + " и будет участвовать в заезде";
    }
}
