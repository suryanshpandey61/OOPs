package file_handling;
import java.io.*;
public class program2  {
public static void main(String[] args) throws Exception {
	FileWriter fw=null;
	try {
		fw=new FileWriter("E://anshu.txt");
		System.out.println("File created successfully");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		fw.close();
	}
}
}
