package shoppingCart;


public class customer {

	private String firstName;
	private String lastName;
	private String address;
	
	public customer (String first, String last, String location){
	
		firstName = first;
		lastName = last;
		address = location;
		
	}
	public String getfirst(){
		return firstName;
	}
	public String getlast(){
		return lastName;
	}
	public String getlocation(){
		return address;
	
	}
}
