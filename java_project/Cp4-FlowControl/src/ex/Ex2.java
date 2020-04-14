package ex;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		num < 0 이라면 “0 미만” 출력
//		0 ≤ num <100 이라면 “0이상 100 미만“ 출력
//		100 ≤ num < 200 이라면 “100이상 200 미만“ 출력
//		200 ≤ num < 300 이라면 “200이상 300 미만“ 출력
//		300 ≤ num 이라면 “300이상 “ 출력
		int num = 200;
		if(num<0) {
			System.out.println("0미만");
		}if(num>=0&&num<100) {
			System.out.println("0이상 100미만");
		}if(num>=100&&num<=200) {
			System.out.println("100상 200미만");
		}if(num>300) {
			System.out.println("300이상");
		}

	}

}
