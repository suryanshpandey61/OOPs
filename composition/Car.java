package composition;

public class Car {
   String name="Thar";
   Engine e=new Engine(121);
   Car(){
	   
   }
   Car(String name){
	   this.name=name;
   }
   Car(String name,Engine e){
	   this.name=name;
	   this.e=e;
   }
   
}
