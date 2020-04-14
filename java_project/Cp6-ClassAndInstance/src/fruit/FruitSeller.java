package fruit;

public class FruitSeller {

	//속성 => 변수
	//   사과의 개수
	//   수입
	//   사과의 가격
	// 멤버변수, 인스턴스 변수
	int numOfApple = 20;	// 사과의 개수
	int  totalMoney = 0;		// 수입
	final int price = 1000;	// 사과의 가격
	
	
	//판매기능 : 매서드
	//1. 돈을 받는다. --> 매개변수 int money
	//2. 받은 돈의 사과의 개수를 구한다.
	//3. 나의 사과의 개수에서 반환해야하는 사과의 개수를 빼준다.
	//4. 받은 금액은 나의 수익으로 더해준다.
	//5. 사과의 개수를 반환한다. --> 반환 데이터 int return 사과의 개수
	int saleApple(int money) {
		int num = money/price;
		numOfApple -= num;	// numOfApple = numOfApple -num;
		totalMoney += money;	// myMoney = myMoney +money;			
		return num;		
	}
	
	
}
