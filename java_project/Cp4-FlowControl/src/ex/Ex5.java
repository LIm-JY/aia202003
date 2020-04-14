package ex;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		if(num<0) {
			System.out.println("0미만");
		}
		switch(num/100){
		case 1:
			System.out.println("0~100미만");
			break;
		case 2:
			System.out.println("100~200미만");
			break;
		default :
			System.out.println("300이상");
				
		}
	}

}
