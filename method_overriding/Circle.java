package method_overriding;

public class Circle extends Shape {
   public void area() {
	   System.out.println("area of circle is PI*r*r");
   }
   
   public static void add(int x,int y) {
	   System.out.println("INT INT MEthod");
   }
   public static void add(double x,int y) {
	   System.out.println("DOUBLE INT MEthod");
   }
   
}


