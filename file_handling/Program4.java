package file_handling;
import java.io.*;
import java.util.Scanner;
public class Program4 {
public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name:");
	String name=sc.nextLine();
	System.out.print("Enter the age:");
	int age=sc.nextInt();
	System.out.println("Enter the weight");
	double weight=sc.nextDouble();
	
	
	
	FileWriter fw=null;
	try {
		fw=new FileWriter("E://StudentDetails.txt");
		fw.write("Name of the student is: "+name);
		fw.write("\nAge is: "+age);
		fw.write("\nWeight is: "+weight);
		System.out.println("File Created Successfully");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		fw.close();
	}
}
}
