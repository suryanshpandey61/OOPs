package file_handling;

import java.io.File;

public class Program1 {
public static void main(String[] args) {
	File f1=new File("E://abc.txt");
	try {
		f1.createNewFile();
		System.out.println("File created successfully");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	f1.setWritable(false);
	
}
}
