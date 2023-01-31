package transport;

public enum Capacity {
    ES(null, 10),
    S(10, 25),
    A(40, 50),
    L(60, 80),
    EL(100, 120);

    private final Integer min;
    private final Integer max;

    Capacity (Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (min == null) {
            return "Вместимость до " + max + " мест";
        } else if (max == null) {
            return "Вместимость до " + min + " мест";
        }
        return "Вместимость от " + min + " до " + max + " мест";
    }
}
