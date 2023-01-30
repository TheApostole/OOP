package transport;

public enum BodyType {
    TYPE1("Седан"),
    TYPE2("Хетчбэк"),
    TYPE3("Купе"),
    TYPE4("Универсал"),
    TYPE5("Внедорожник"),
    TYPE6("Кроссовер"),
    TYPE7("Пикап"),
    TYPE8("Фургон"),
    TYPE9("Минивэн");

    private final String name;

    BodyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Тип кузова: " + name;
    }
}
