package transport;

import java.util.Objects;

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
    public void performMaintenance(Transport transport) {
        System.out.println("Механик " + surname + " " + name + " из компании " + company + " проводит техобслуживание автомобиля " + transport);
    }

    public void fixTheCar() {
        System.out.println("Механик " + surname + " " + name + " из компании " + company + " чинит машину!");
    }

    @Override
    public String toString() {
        return "Механик: " + surname + " " + name + " из компании " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return name.equals(mechanic.name) && surname.equals(mechanic.surname) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}
