package composition;

public class Engine {
   int hp;
   public void start() {
	  System.out.println("Start method  of  the engine class");
   }
   Engine(){
	   System.out.println();
   }
   Engine(int hp){
	   this.hp=hp;
	  
   }
   
}
