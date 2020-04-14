package ex;

public class Method1 {

	public static void main(String[] args) {
		// 메서드를 사용하기 위해서는 인스턴스(객체)를 생성한 후 사용한다.
		//메서드 코드를 메모리에 로드한다
		
		//인스턴스 생성(객체생성)
		MyMath math = new MyMath(); //MyMath = 주소값
		
		long result = math.add(10, 100);
		
		System.out.println(result);
		
		System.out.println(math.add(1000000000, 100000000));
	
	}
	int add() { //메서드의 선언부
		return 10;
	
}
}