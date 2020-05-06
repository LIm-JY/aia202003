package ex;

public class Calculator {

	//메서드 실행 횟수 카운트
	int opCnt = 0;
	
	int add(int n1, int n2) {
		
		System.out.println("덧셈연산");
		
		return n1+n2;
	}
	
	int min(int n1, int n2) {
		
		System.out.println("뺼셈연산");
		synchronized (this) {opCnt++;}
		return n1-n2;
	}
	void showOpCnt() {
		System.out.println("연산의 횟수는"+opCnt+"입니다");
	}
}
