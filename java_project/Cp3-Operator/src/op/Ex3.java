package op;

public class Ex3 {

	public static void main(String[] args) {
		// 3+6, 3+6+9, 3+6+9+12 의 연산을 하는 프로그램 작성.
		//단. 덧셈 연산의 횟수 최소화
		int sum = 0;
		
		for(int i=3; i<15; i++) {
		if(i%3==0){
			sum += i;
			if(sum > 3)
			
			
			System.out.println(sum);
		}
	}
	
	
}
}