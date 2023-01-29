package transport;

public enum Сapacity {
    ESPECIALLY_SMALL(0, 10),
    SMALL(10, 25),
    AVERAGE(40, 50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);

    private Integer min;
    private Integer max;

    Сapacity (Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        return "Вместимость от " + min + " до " + max;
    }
}
