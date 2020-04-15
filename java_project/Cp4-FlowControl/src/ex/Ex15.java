package ex;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
//		if (n==1) {
//			System.out.println("현재인원은 "+n+"명입니다");
//		}if (n==2) {
//			System.out.println("현재인원은 "+n+"명입니다");
//		}if (n==3) {
//			System.out.println("현재인원은 "+n+"명입니다");
//		}if (n>3) {
//			System.out.println("현재 많은 사람이 있습니다.");
//		}
		
		switch(n) {
		case 1:
			System.out.println("현재 인원은"+n+"명입니다");
			break;
		case 2:
			System.out.println("현재 인원은"+n+"명입니다");
			break;
		case 3:
			System.out.println("현재 인원은"+n+"명입니다");
			break;
		default:
			System.out.println("현재 많은 사람들이 있습니다");
		}
	}

}
