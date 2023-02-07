package transport;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServiceStation {
   private Queue<Transport> queue;

   /**
    * Геттеры
    */
   public Queue<Transport> getQueue() {
      return queue;
   }

   /**
    * Сеттеры
    */
   public void setQueue(Queue<Transport> queue) {
      this.queue = queue;
   }

   /**
    * Конструктор
    */
   public ServiceStation(Queue<Transport> queue) {
      this.queue = queue;
   }

   /**
    * Методы
    */
   public void addACarToTheQueue(Transport transport) {
      if (transport.checksTheAdditionToTheQueue()) {
         queue.add(transport);
      }
   }

   public void carryOutATechnicalInspectionOfTheCar () {
      if (!queue.isEmpty()) {
         Transport transport = queue.poll();
      }
   }
   public void carryOutAVehicleInspection(Queue<Transport> queue) {
      if (queue.isEmpty()) {
         System.out.println("У данного ТС нет механников");
      }else {
         Transport transport = queue.poll();
         List<Mechanic> mechanics = transport.getMechanics();
         for (Mechanic mechanic : mechanics) {
               mechanic.performMaintenance(transport);
         }
      }
   }
}
