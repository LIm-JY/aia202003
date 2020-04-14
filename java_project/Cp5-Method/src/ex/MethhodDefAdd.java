package ex;

public class MethhodDefAdd {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		System.out.println('\n');
			hiEveryone(7,110.5);
			hiEveryone(17,175.5);
			hiEveryone(20,153.7);
			hiEveryone(15,162);
			hiEveryone(31,180.5);
			hiEveryone(24,165);
			System.out.println('\n');
			System.out.println("프로그램 종료");
			
		//System.out.println("좋은 아침입니다."); 
		//System.out.println("제 나이는"+20+"세 입니다.");
		//System.out.println("좋은 아침입니다."); 
		//System.out.println("제 나이는"+17+"세 입니다.");
		//System.out.println("좋은 아침입니다."); 
		//System.out.println("제 나이는"+25+"세 입니다.");
		//System.out.println("좋은 아침입니다."); 
		//System.out.println("제 나이는"+23+"세 입니다.");
		
		

	}

		//인사말 출력, 나이값을 받아서 나이를 출력하는 메서드
		static void hiEveryone(int age, double height) {
			System.out.println("좋은 아침입니다."); 
			
			if(age<10||age>30) {
				return;
			}
			System.out.println("제 나이는"+age+"세 입니다.");
			System.out.println("제 키는 "+height+"cm입니다");
		
		}
		
}
