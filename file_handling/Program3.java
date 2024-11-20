package file_handling;
import java.io.*;
public class Program3 {
public static void main(String[] args) throws Exception {
	File f1=new File("E://program3.txt");
	FileWriter fw=null;
	
	
	try {
		f1.createNewFile();
		fw=new FileWriter(f1);
		fw.write("131");
		fw.write("\nANshu  pandey is here");
		System.out.println("File created suceessfully");
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	finally {
		fw.close();
	}
	
	}
}
