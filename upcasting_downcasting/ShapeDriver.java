package upcasting_downcasting;

public class ShapeDriver {
   public static void main(String[] args) {
	   
//	   upcasting 
	   Shape s1=new Circle();
	   Shape s2=new Triangle();
	   Shape s3=new Rectangle();
	   
//	   System.out.println();
	   
	   //down casting by help of typecast operator
	   Circle c1=(Circle)s1;
	   System.out.println(c1.a);
	   
	   Triangle t1=(Triangle)s2;
	   System.out.println(t1.q);
	   
	   Rectangle r1=(Rectangle)s3;
	   System.out.println(r1.e);
   }
}
