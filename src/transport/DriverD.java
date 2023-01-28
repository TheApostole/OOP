package transport;

public class DriverD <T extends Bus> extends Driver {

    /**
     * Конструктор
     */
    public DriverD(String fIODriver, boolean thePresenceOfADriverLicense, int experience) {
        super(fIODriver, thePresenceOfADriverLicense, experience);
    }

    /**
     * Методы
     */
    @Override
    void startMoving() {
        System.out.println("Водитель категории D " + getfIODriver() + " начал автобус");
    }

    @Override
    void finishTheMovement() {
        System.out.println("Водитель категории D " + getfIODriver() + " закончил автобус");
    }

    @Override
    void refuelTheCar() {
        System.out.println("Водитель категории D " + getfIODriver() + " заправляет автобус");
    }

    public String receiveAndPrintInformation(T Bus) {
        return "Водитель " + getfIODriver() + " управляет автобусом " + Bus.getBrand() + " " + Bus.getModel() + " и будет участвовать в заезде";
    }
}
