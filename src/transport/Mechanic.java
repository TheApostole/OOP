package transport;

public class Mechanic {
    private String name;
    private String surname;
    private String company;

    /**
     * Геттер
     */
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    /**
     * Сеттер
     */
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Конструктор
     */
    public Mechanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    /**
     * Методы
     */
    public void performMaintenance() {
        System.out.println("Провести техобслуживание!");
    }

    public void fixTheCar() {
        System.out.println("Починить машину!");
    }

    @Override
    public String toString() {
        return "Механик: " + surname + " " + name + " из компании " + company;
    }
}