package shoppingCart;

import shoppingCart.storeItems;
import java.util.ArrayList;

public class cart {
	int amount = 0
	private ArrayList<Item> cart = new ArrayList<Item>(); 
	private double totalPrice;
		
	}
	public void addToCart(String itemName, String description, double amount)
	{
		Item temp = new Item(itemName, description, amount);
		cart.add(Item);
		
	}
	public void deleteItem(itemName){
			if (UserInput == deleteItem (itemName))
			cart.remove(itemName);
				System.out.print("Item deleted")
				
		
	}
	public void deleteAll{
			if (userInput == deleteAll)
			cart.clear();
				System.out.print("All items deleted");
	}
	
	public String toSting(){
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		
		String contents = "Shopping Cart";
		contents = "Item\t\tUnit Price\tQuantity\tTotal";
		
	public 	void Total(double amount)
		for (int i=0; i < amount; i++)
			sum += i;
		
		return double totalPrice;
		
	}
	
}


