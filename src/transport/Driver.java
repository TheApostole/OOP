package transport;

import java.util.Objects;

public abstract class Driver {

   private String fIODriver;
   private boolean thePresenceOfADriverLicense;
   private int experience;

   /**
    * Геттеры
    */
   public String getfIODriver() {
      return fIODriver;
   }
   public boolean isThePresenceOfADriverLicense() {
      return thePresenceOfADriverLicense;
   }
   public int getExperience() {
      return experience;
   }

   /**
    * Сеттеры
    */
   public void setfIODriver(String fIODriver) {
      this.fIODriver = fIODriver;
   }
   public void setThePresenceOfADriverLicense(boolean thePresenceOfADriverLicense) {
      this.thePresenceOfADriverLicense = thePresenceOfADriverLicense;
   }
   public void setExperience(int experience) {
      this.experience = experience;
   }

   /**
    * Конструктор
    */
   public Driver(String fIODriver, boolean thePresenceOfADriverLicense, int experience) {
      this.fIODriver = fIODriver;
      this.thePresenceOfADriverLicense = thePresenceOfADriverLicense;
      this.experience = experience;
   }

   /**
    * Методы
    */
   @Override
   public String toString() {
      return "Водитель: " + fIODriver;
   }

   abstract void startMoving();

   abstract void finishTheMovement();

   abstract void refuelTheCar();

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Driver driver = (Driver) o;
      return thePresenceOfADriverLicense == driver.thePresenceOfADriverLicense && experience == driver.experience && fIODriver.equals(driver.fIODriver);
   }

   @Override
   public int hashCode() {
      return Objects.hash(fIODriver, thePresenceOfADriverLicense, experience);
   }
}
