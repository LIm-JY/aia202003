package ex;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {

			int age = readAge();
			System.out.println("나이는: " + age + "세 입니다");			

		}
	catch(AgeInputException e){
		
		System.out.println(e.getMessage());
		e.printStackTrace();
		
	}catch(Exception e){
		
		System.out.println("에러메시지: " + e.getMessage());
		e.printStackTrace();
		}
		System.out.println("프로그램이 정상종료 되었습니다.");

}


	static int readAge() throws AgeInputException {

		Scanner sc = new Scanner(System.in);

		System.out.println("나이를 입력해주세요: ");
		int age = sc.nextInt();

		if (age < 0) {

//			Exception e = new Exception("고의로 발생시킴");
			AgeInputException e = new AgeInputException();
			throw e; // 강제적으로 예외를 발생시킴
		}

		return age;
	}

}
