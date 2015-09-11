package strategy.shoppingcartdemo;

import strategy.shoppingcartdemo.CreditCardStrategy;
import strategy.shoppingcartdemo.Item;
import strategy.shoppingcartdemo.PaypalStrategy;
import strategy.shoppingcartdemo.ShoppingCart;

public class ShoppingCartTest {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("1234", 10);
		Item item2 = new Item("5678", 40);
		cart.addItem(item1);
		cart.addItem(item2);
		// pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));
		// pay by credit card
		cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456"));
	}
}
