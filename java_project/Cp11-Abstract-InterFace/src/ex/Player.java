package ex;

//class 앞에 abstract 키워드가 있는경우 이 클래스는 추상클래스 임을 의미한다
//추상 클래스는 미완성된 클래스를 의미한다
//클래스의 멤버중 추상메서드를 하나라도 포함하고 있는경우 -> 추상클래스

public abstract class Player {
	
	int currentPos;
	
	Player(){
	}
	
	//추상메서드: avstract 반환형 메서드이름(매개변수)
	abstract void play(int Pos);
	
	abstract void stop();
	
	void play() {
		play(currentPos);
	}

}
