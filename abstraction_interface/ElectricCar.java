package abstraction_interface;

public class ElectricCar implements Car  {
	@Override
      public void openGate() {
    	  System.out.println("Electric Car open the gate");
      }
	@Override
      public void accelerate() {
    	  System.out.println("Electric Car Accelerate");
      }
	@Override
      public void start() {
    	  System.out.println("Electric Car Start");
      }
	@Override
      public void stop() {
    	  System.out.println("Electric Car Stop");
      }
}
