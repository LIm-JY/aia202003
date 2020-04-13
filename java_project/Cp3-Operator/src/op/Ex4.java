package op;

public class Ex4 {

	public static void main(String[] args) {
		//a= {{(25+5)+(36/4)}-72}*5,
		//b= {{(25x5)+(36-4)}-71}/4,
		//c=(128/4)*2 일 때
		//a>b>c 가 참이면 true 아니면 false를 출력하는 프로그램 작성 

		int a = ((25+5)+(36/4))-72*5;
		int b = ((25*5)+(36-4)-71)/4;
		int c = (128/4)*2;

		if((a>b&&b>c) == true) {
		System.out.println("true");
		}else {
		System.out.println("false");
		}
		}
	}

