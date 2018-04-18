package shoppingCart;

import shoppingCart.storeItems;

public class cart {
	private storeItem[] cart;
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
	public void addToCart(String itemName, String description, double amount)
	{
		Item temp = new Item(itemName, description, amount);
		cart[itemCount] = temp;
		itemCount += 1;
		//adds an item to cart
	}
	public void deleteItem(itemName){
		for (cart)
			if (UserInput == deleteItem (itemName))
			return null;
				System.out.print("Item deleted")
				
		//loop through the cart array, comparing the item names of the cart items
		// to the item name passed in as a parameter. When you find the correct
		// item, then you can set that space of the array to null

		cart.remove(itemName);
	}
	public void deleteAll{

		for(cart)
			if (userInput == deleteAll)
			return null;
				System.out.print("All items deleted");
			
				
				//null all items, but not the cart itself
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
