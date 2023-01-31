package transport;

public enum LoadCapacity {

    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float min;
    private final Float max;

    LoadCapacity (Float min, Float max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public String toString() {
        if (min == null) {
            return "Грузоподъемность до " + max + " тонн";
        } else if (max == null) {
            return "Грузоподъемность от " + min + " тонн";
        }
        return "Грузоподъемность от " + min + " до " + max + " тонн";
    }
}
