package ex;

public class PhoneMainEx {

	public static void main(String[] args) {
		
		// 생일값이 있는경우
		PhoneInforEx inforex = new PhoneInforEx("임재영", "111-7777-7777", "2020-22-22");
		
		inforex.showInfor();
		
		//생일값이 없는경우
		inforex = new PhoneInforEx("차두리", "122-555-9997");
		
		inforex.showInfor();
	}

}
