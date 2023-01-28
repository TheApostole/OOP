package transport;

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
   abstract void startMoving();

   abstract void finishTheMovement();

   abstract void refuelTheCar();

}
