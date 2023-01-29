package transport;

public enum BodyType {
    SEDAN("Седан"),
    HATCHBACK("Хетчбэк"),
    COMPARTMENT("Купе"),
    UNIVERSAL("Универсал"),
    SUV("Внедорожник"),
    CROSSOVER("Кроссовер"),
    PICKUP("Пикап"),
    VAN("Фургон"),
    MINIVAN("Минивэн");

    private final String type;

    BodyType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + type;
    }
}
