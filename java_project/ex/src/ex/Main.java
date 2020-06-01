package ex;

public class Main {

	public static void main(String[] args) {

		
		EmpManager emg = new EmpManager();
		
		
		System.out.println("1. 부서관리 2. 회원관리");
		int selectNum = emg.sc.nextInt();
		switch (selectNum) {
		
		case 1:
			emg.deptManager();
			break;

		case 2:
			emg.empManager();
			break;
			
		default:
			break;
		}
		
		
		
		
		
		
		
		

	}

}
