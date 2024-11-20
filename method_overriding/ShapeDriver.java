package method_overriding;

public class ShapeDriver {
   public static void main(String[] args) {
	   Shape s1=new Shape();
	   s1.area();
	   System.out.println("===============");
	   
	   Shape s2=new Circle();
	   s2.area();
	   
	   Circle c1=(Circle)s2;
	   c1.add(12, 120);
	   System.out.println("===============");
	   
	
	   
	   Shape s3=new Reactangle();
	   s3.area();
	   System.out.println("===============");
	   
	   Shape s4=new Triangle();
	   s4.area();
	   
	   
   }
}
