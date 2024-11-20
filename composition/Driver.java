package composition;

public class Driver {
   public static void main(String[] args) {
	   Car c1=new Car("Scorpio");
	 //  System.out.println("Car obj refrence is "+c1);
	 //  System.out.println("Car engine refrence is"+c1.e);
	  // System.out.println("Car name is "+c1.name);
	 //  System.out.println("Car engine hp "+c1.e.hp);
	  // c1.e.start();
	   
	
	   
	 Car c2=new Car("Fortuner",new Engine(12));
	   
	   System.out.println(c2.e.hp);
	   c2.e.start();
		   
	   
	   
	   
   }
}
