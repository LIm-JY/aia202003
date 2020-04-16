package tv;

public class Tv {

	
		// Tv의 속성(변수)-> 멤버변수, 인스턴스변수
		String Color;	//Tv의 색상 값
		boolean power;	//Tv의 전원 상태
		int channel;	//Tv의 채널 값
		
		// Tv의 기능 -> 메서드, 클래스 멤버
		// Tv의 전원을 키고/끄는 기능
		void power() {
//			if(power) {
//				power = false;
//			}else {
//				power = true;
//			}
//			위 코드들을 아래의 코드로 변경가능
			power =!power;
		}
		//채널을 올리는
		void channelUp() {
//			channel = channel+1;
//			channel += 1;
//			channel++;
			++channel;
		}
		//채널을 내리는
		void channelDown() {
			channel--;		
		}
		//채널값을 변경하는 : 채널 값을 받아서 변경
		void channelChange(int ch) {
			channel = ch;
		}
		
}











