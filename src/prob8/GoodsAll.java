package prob8;

public class GoodsAll {
	private String name;
	private int price;
	private int countStock;
	
	public void GoodsAll( String name, int price, int countStock ){
		this.name = name;
		this.price = price;
		this.countStock = countStock;
	}
	
	public void showGoods() {
		System.out.println(this.name + "(가격:" + this.price + "원)이 " + this.countStock + "개 입고 되었습니다.");
	}
}
