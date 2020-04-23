package car;

public class Car {
	
	String color;
	int door;
	
	void drive() {
		System.out.println("운전");
		
	}
	void stop() {
		System.out.println("멈춤");
		
	}
	public static void main(String[]args) {
		Car car = null;
		Fireengine fe1 = new Fireengine();
		Fireengine fe2 = null;
		Ambulance am = null;
		
		fe1.water();
		car = fe1;	//하위클래스에서 상위클래스로 갈때는 형변환 생략가능
		//car.water();
		
		fe2 = (Fireengine)car;
		
		
//		System.out.println(car instanceof Ambulance);
		
		
		
		if(car instanceof Ambulance) {
			am = (Ambulance)car;
			am.siren();
			
		}
		
		
	}
}

class Fireengine extends Car{
	
	void water() {
		System.out.println("물뿌리기");
	}
		
}
class Ambulance extends Car{
	
	void siren() {
		System.out.println("위이잉~~~~~~~");
	}
	
}
