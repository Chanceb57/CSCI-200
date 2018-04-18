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
	public void setfirstName(String first){
		this.firstName = first;
	}
	public String getlast(){
		return lastName;
	}
	public void setlastName(String last){
		this.lastName = last;
	}
	public String getlocation(){
		return address;
	}
	public void setaddress(String location){
		this.address = location;
	}
}
