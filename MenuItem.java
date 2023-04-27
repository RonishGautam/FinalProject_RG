
public class MenuItem <T>{ // <T> the type of price, can be Double, Integer, or any other numerical type.
	
	private String name;
	private T price;
	private String description;
	
	
	public MenuItem(String name, T price, String dec) {
		this.name=name;
		this.description=dec;
		this.price=price;
	
	}//End MenuItem Constructor. 
	 public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	/**
     Constructs a new menu item with the given name and price.
      name the name of the menu item
      price the price of the menu item
     */


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	// Getter and Setter for Name. 


	public T getPrice() {
		return price;
	}


	public void setPrice(T price) {
		this.price = price;
	
	}
	
}//End MenuIteam
