package encapsulation;

public class EmployDriver {
   public static void main(String[] args) {
	   Employ e1=new Employ();
	   
//	   set the value by setters()
	   e1.setName("Anshu");
	   e1.setId(12);
	   e1.setSalary(432.45);
	   
//	   get the value by getters()
	   System.out.println("Name of the employ is: "+e1.getName());
	   System.out.println("Id of the employ is: "+e1.getId());  
	   System.out.println("Salary of the employ is:"+e1.getSalary());
   }
}
