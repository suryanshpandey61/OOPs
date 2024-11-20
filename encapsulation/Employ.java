package encapsulation;
import java.util.Scanner;

public class Employ {
   String name;
   int id;
   double salary;
   private int server_pin=21;
   
   public void setName(String name) {
	   
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the pin to set name:=");
	   int user_pin=sc.nextInt();
	   
	   if(user_pin==server_pin) {
		   System.out.println("Validation successfull set the name");
		   this.name=name;
	   }
	   
	   else {
		   System.out.println("Wrong pin not validated and name not set!");
	   }
   }
   
   public String getName() {
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter the pin to getname:=");
	   int user_pin=sc.nextInt();
	   if(user_pin==server_pin) {
		   System.out.println("Validation successfull to get name");
		   return name;
	   }
	   else {
		   System.out.println("Wrong pin can not provide you name");
		   return null;
	   }
   }
   
   public void setId(int id) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the pin to setId:=");
	   int user_pin=sc.nextInt();
	   if(user_pin==server_pin) {
		   System.out.println("Validation correct id set Successfully!");
		   this.id=id;
	   }
	   else {
		   System.out.println("Wrong pin can not set the id");
	   }	   
   }
   
   public int getId() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the pin to getId:=");
	   int user_pin=sc.nextInt();
	   if(user_pin==server_pin) {
		   System.out.println("Validation successfull for Id");
		   return id;
	   }
	   else {
		   System.out.println("Wrong pin can not validate");
		   return 0;
	   }
   }
   
   public void setSalary(double salary) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the pin for salary:");
	   int user_pin=sc.nextInt();
	   if(user_pin==server_pin) {
		   System.out.println("Validation successfully salary is set");
		   this.salary=salary;
	   }
	   else {
		   System.out.println("Wrong pin Salary can not set!");
	   }
   }
   
   public double getSalary() {
	   Scanner sc=new Scanner(System.in);
	   int user_pin=sc.nextInt();
	   if(user_pin==server_pin) {
		   System.out.println("Validation successfull for salary");
           return salary;
	   }
	   else {
		   System.out.println("Wrong pin can not get salary");
		   return 0.0;
	   }
   }
   
   
}
