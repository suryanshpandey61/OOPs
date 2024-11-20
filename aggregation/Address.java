package aggregation;

public class Address {
     String city;
     int pinCode;
     Address(){
    	 
     }
     Address(String city,int pinCode){
    	 this.city=city;
    	 this.pinCode=pinCode;
     }
     public void getDetailsOfAddress() {
    	 System.out.println("City is "+city);
    	 System.out.println("Pincode is "+pinCode);
     }
}
