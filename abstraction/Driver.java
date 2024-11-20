package abstraction;

public class Driver {
 public static void main(String[] args) {
	 //upcasting
	Vehicle v1=new ElectricCar();
	v1.drive();
	v1.start();
	v1.accelerate();
	System.out.println("==========");
	//downcasting

	Car c1=(Car)v1;
	c1.openGate();
	
	System.out.println("===========");
    ElectricCar e1=(ElectricCar)v1;
    System.out.println(e1.volt);
    
    
   
    
}
}
