package fruit;

public class FruitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 셀러 생성 : 인스턴스화
		FruitSeller seller = new FruitSeller();
		// new FruitSeller(); ->객체생성, 메모리에 변수와
		// 변수의 데이터와 메서드가 저장된다.
		
		// 구매자 생성 : 인스턴스화
		FruitBuyer buyer = new FruitBuyer();
		//FruitByer:참조변수, buyer:식별자
		// 바이어가 사과를 구매
		buyer.buyApple(seller, 5000);
		System.out.println("구매자가 5000원을 지불하여 사과 구매");
		
		System.out.println("판매자 판매 정보 출력");
		System.out.println("현재 사과의 개수: "+ seller.numOfApple);
		System.out.println("판매금액: "+ seller.myMoney);
		
		System.out.println("-------------------");
		System.out.println("구매자의 정보");
		System.out.println("현재 보유 금액: "+buyer.myMoney);
		System.out.println("보유한 사과 개수: "+buyer.numOfApple);
		
		
		
	}

}
