package shoppingCart;

public class storeItems {

	private String itemName;
	private String itemDescription;
	private double itemPrice;
	
	public storeItems (String sName, String sDescription, double sPrice){
		itemName = sName;
		itemDescription = sDescription;
		itemPrice = sPrice; }

	
	public String getsName(){
		return itemName;
	}
	public void setitemName(String sName){
		this.itemName = sName;
	}
	public String getsDescription(){
		return itemDescription;
	}
	public void setitemDescription(String sDescription){
		this.itemDescription = sDescription;
	}
	public double getsPrice(){
		return itemPrice;
	}
	public void setitemPrice(double sPrice){
		this.itemPrice = sPrice;
	}

}
