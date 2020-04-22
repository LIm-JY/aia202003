package ex2;
//Version 0.1 전화번호 관리 프로그램. 
//
//PhoneInfor 라는 이름의 클래스를 정의해 보자. 
//클래스는 다음의 데이터들의 문자열 형태로 저장이 가능 해야 하며, 
//저장된 데이터의 적절한 출력이 가능하도록 메소드 정의
//
//• 이름            name              String
//• 전화번호       phoneNumber     String
//• 생년월일       birthday            String 
//
//단, 생년월일 정보는 저장할 수도 있고, 저장 않을 수도 있게끔 생성자 생성.

public class PhoneInforEx {
	
	String name;
	String phoneNumber;
	String birthday;
	
	
	public PhoneInforEx(String name, String phoneNumber, String birthday) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	PhoneInforEx(String name, String phoneNumber){
		
		this(name,phoneNumber,"생일 입력 안됨");
		
	}
	void showInfor() {
		
		System.out.println("이름: "+this.name);
		System.out.println("전화번호: "+this.phoneNumber);
		System.out.println("생일: "+this.birthday);
//		생략 후 위의 null값을 문자열로 변경가능		
//		if(birthday==null) {
//			System.out.println("생일입력안됨");
//		}
		
	}
	
	

}
