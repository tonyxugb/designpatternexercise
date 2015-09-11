package strategy.shoppingcartdemo;

/**
 *@Description:商品条目
 *@Author:tony
 *@Since:2015年9月8日
 */
public class Item {
	private String upcCode;
	private int price;

	public Item(String upc, int cost) {
		this.upcCode = upc;
		this.price = cost;
	}

	public String getUpcCode() {
		return upcCode;
	}

	public int getPrice() {
		return price;
	}
}
