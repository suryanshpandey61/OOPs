package abstraction;

public abstract class Car extends Vehicle {
    int hp;
    Car(){
    	
    }
    Car(String name,double price,int hp){
    	super(name,price);
    	this.hp=hp;
    }
    public abstract void openGate();
    public  void playMusic() {
    	System.out.println("Play music in Car");
    }
}
