import java.util.ArrayList;


public class VisitorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Visitable> itemList = new ArrayList<Visitable>();
		itemList.add(new CD(1.0, 2.0));
		itemList.add(new Book(7.0, 2.0));
		itemList.add(new Book(26.0, 4.0));
		itemList.add(new CD(8.0, 0.5));
		
		ShoppingCart shopping_cart = new ShoppingCart(itemList);
		
		double postage = shopping_cart.calculatePostage();
		
	}

}
