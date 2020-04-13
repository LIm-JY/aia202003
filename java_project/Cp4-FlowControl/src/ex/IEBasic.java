package ex;

public class IEBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (true) {
			System.out.println("true일때 출력");	
		}
		if (false) {
			System.out.println("true일때 출력");//노란색 밑줄은 구문상 틀린내용은 아니지만
		}									 //dead code: 실행 안하는 코드이다		
		if (false) {
			System.out.println("true일때 출력");
		}
		else {
			System.out.println("false일때 출력");
		}
		if(10>5) {
			System.out.println("10은5보다 큽니다");
		}
		int num = 10;
		
		if(num==5) {
			System.out.println("10은5와 같습니다.");
		}
}
}


