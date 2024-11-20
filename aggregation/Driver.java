package aggregation;

public class Driver {
   public static void main(String[] args) {
	Address a1=new Address("Noida",201301);
	Address a2=new Address("England",54328);
	Student s1=new Student("Anshu",61);
	a1.getDetailsOfAddress();
	System.out.println("==========");
	s1.getDetailsOfStudent();
	System.out.println("==========");
	Student s2=new Student("Suryansh",51,new Address("Sultanpur",11027));
	
	s2.getDetailsOfStudent();
    s2.a.getDetailsOfAddress();
    
    System.out.println("==========");
    
  
    Student s3=new Student("Gaurav",02,a2);
    s3.a.getDetailsOfAddress();
    s3.getDetailsOfStudent();
    System.out.println("==========");
    s3=null;
    
    a2.getDetailsOfAddress();
}
}
