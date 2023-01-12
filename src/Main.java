public class Main {

    public static void main(String[] args) {

        Car car = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7);
        Car car2 = new Car("Audi", "A8 50L TDI quattro", 2020, "Германия", "чёрный", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "чёрный", 3.0);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 2.4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }

}