import java.util.ArrayList;

public class Menu {

	private ArrayList<MenuItem> items;
	
	public Menu() {
		items = new ArrayList<>();
		
	}
	
	public void addItem(MenuItem item) {
		items.add(item);
	}
	public MenuItem getItem (int num) {
		return items.get(num);
		
	}
	public int getSize() {
		return items.size();
	}
}
