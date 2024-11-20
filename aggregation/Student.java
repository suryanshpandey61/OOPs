package aggregation;

public class Student {
   String name;
   int rollno;
   Address a;
   Student(){
	   
   }
   Student(String name,int rollno){
	   this.name=name;
	   this.rollno=rollno;
   }
   Student(String name,int rollno,Address a){
	   this.name=name;
	   this.rollno=rollno;
	   this.a=a;
   }
   public void getDetailsOfStudent() {
	   System.out.println("Name of the Sutdent "+name);
	   System.out.println("Roll no is "+rollno);
   }
}
