package ex1;

public class CharToCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch = 'A'; // char ch = '\u0041';로 바꿔 써도 같다.
		int code = (int)ch; // ch에 저장된 값을 int형으로 변환 하여 저장한다.
				//(int)ch 형변환
		System.out.println(ch);
		System.out.println(code);
		
		/*
		 int code = 65; // 또는 int code = 0x0041;
		char ch = (char)code; //(char)code를 명시적 형변환이라 표현
		System.out.println(code);
		System.out.println(ch);*/
	}

}
