package scm;


// 상품객체들의 상위 클래스
public class Product {
	
	final int price;	//제품가격
	final int bonusPoint;	//제품의 포인트
	
	
	
	public Product(int price) {
		this.price = price;
		this.bonusPoint = this.price/10;
	}
	
}
