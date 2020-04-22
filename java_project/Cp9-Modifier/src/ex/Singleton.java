package ex;

public class Singleton {
	
	//1. 생성자의 접근 제어 지시자: private ->인스턴스 생성 불가
	private Singleton() {}
	
	//2. 공유할 객체를 생성
	private static Singleton s = new Singleton();
	
	//3. 참조값을 반환하는 메서드 생성
	static Singleton getInstance(){
		return s;
	}
	
	public void print() {
		System.out.println("Singleton !!");
	}
	
	

}
