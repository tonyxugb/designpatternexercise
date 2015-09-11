package strategy.shoppingcartdemo;

public class CreditCardStrategy implements PaymentStrategy {

	private String name;
	private String cardNumber;

	public CreditCardStrategy(String name, String cardNumber) {
		this.name = name;
		this.cardNumber = cardNumber;
	}

	@Override
	public void pay(int amount) {
		System.out.println("paid with credit card! name:" + name
				+ ",cardNumber:" + cardNumber);
	}
}
