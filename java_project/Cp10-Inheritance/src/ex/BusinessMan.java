package ex;

public class BusinessMan extends Man {

	String company;
	String positon;
	
	//조상클래스의 생성자가있다면 자손클래스의 생성자에서
	//값을 받아 조상클래스의 생성자를 호출햐서 초가화를 해준다
	BusinessMan(String name, String company, String position ) {
		super(name);
		this.company=company;
		this.positon = position;

	
	}
	void tellYourInfo() {
		tellYourName();
		
		System.out.println("나의 직장 이름은: "+ company);
		System.out.println("내 직장 직급은"+positon);
	}
		

}
