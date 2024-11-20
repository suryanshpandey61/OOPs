package abstraction;

public class ShapeDriver {
   public static void main(String[] args) {
	TwoDShape t1=new Circle();
	t1.getArea();
	System.out.println(t1.shape_value);
	//downcasting to fetch details of child class 
	System.out.println("================");
	Circle c1=(Circle)t1;
	System.out.println("Value of circle child ");
	System.out.println(c1.circle_value);
	
	System.out.println("================");
	TwoDShape t2=new Rectangle();
	Rectangle r1=(Rectangle)t2;
	System.out.println("Value of rectangle child");
	
	System.out.println(r1.rectangle_value);
	
	
	t2.getArea();
}
}
