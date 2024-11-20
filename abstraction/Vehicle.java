package abstraction;

public abstract class Vehicle {
  String name;
  double price;
  Vehicle(){
	  
  }
  Vehicle(String name,double price){
	  this.name=name;
	  this.price=price;
  }
  public abstract void drive();
  public abstract void start();
  public void accelerate() {
	 System.out.println("Accelerate the Vehicle");
  }
}
