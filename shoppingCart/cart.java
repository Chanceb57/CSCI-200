package shoppingCart;

import shoppingCart.storeItems;

public class cart {
	private Item[] cart;
	private int itemCount;
	private double totalPrice;
	//public static void main(String[]args){
		//ArrayList<Item> cart = new ArrayList<Item>();
		public cart{
		cart = new Item[capacity];
		itemCount = 0;
		totalPrice = 0.0;
		//empty shopping cart
	}
	public void addToCart(String itemName, double price, int amount)
	{
		Item temp = new Item(itemName, price, amount);
		totalPrice = (price * amount);
		itemCount = amount;
		cart[itemCount] = temp;
		//adds an item to cart
	}
	public void deleteItem(itemName){
		cart.remove(itemName);
	}
	public void deleteAll{
		cart.remove
	}
	
	public String toSting(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String contents = "Shopping Cart";
		contents = "Item\t\tUnit Price\tQuantity\tTotal";
		
		for (int i=0; i<itemCount; i++)
			contents += cart[i].toString() + " ";
		
		contents = "Total Price: " + fmt.format(totalPrice);
		contents = " ";
		
		return contents;
		//contains of the shopping cart together, summerized
	}
	
}
