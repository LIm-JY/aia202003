package ex2;

import java.util.Scanner;

//Project : ver 0.20
//"프로그램 사용자로부터 데이터 입력"
//프로그램 사용자로부터 데이터를 입력 받아 클래스의 인스턴스를 생성하는 것이
//핵심.
//단 반복문을 이용해서 프로그램의 흐름을 계속 유지하도록 한다.
//프로그램 종료를 하지 않으면, 다음과 같은 과정이 반복적으로 이루어짐.
//
//키보드로부터 데이터 입력 
//↓
//입력 받은 데이터로 인스턴스 생성
//↓
//생성된 인스턴스의 메소드 호출
//-PhoneBookManager
//기능: 사용자에게 입력을 받는다

public class PhoneBookManager {
	

	
		
	PhoneInforEx createInstance() {	//PhoneInforEx타입의 createInstance()변수
		PhoneInforEx info = null;
		
		Scanner sc = new Scanner(System.in);
		
		//이름 입력 받기
		System.out.println("사용자의 이름을 입력해주세요: ");
		info.name = sc.nextLine();
		
		
		
		
		
		
		return info;
	}
			
			
		
	
	
	
	
	
	
	
	

}
