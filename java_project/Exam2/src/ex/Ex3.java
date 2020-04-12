package ex;

public class Ex3 {
	public static void main(String[]args) {
		// 짝수와 홀수 판별하기
		int a =17;
		
		int result = a%2; //나머지값을 이용해 홀수 짝수 판별
		
		if(result >0) { // 나머지값이 0보다 크면 홀수
			System.out.println("홀수입니다");
		}else {			// 아니면 짝수
			System.out.println("짝수입니다");
		}
	}

}
