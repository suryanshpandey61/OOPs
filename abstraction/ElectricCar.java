package abstraction;

public class ElectricCar extends Car{
   int volt=10;
   ElectricCar(){
	   
   }
   ElectricCar(String name,double price,int hp,int volt){
	   super(name,price,hp);
	   this.volt=volt;
   }
   public void drive() {
	   System.out.println("Drive the Electric Car");
   }
   public void start() {
	   System.out.println("Start the Electric Car");
   }
   public void openGate() {
	   System.out.println("Open Gate Electric Car");
   }
}
