package ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {

		//java.util.Date
		//날짜와 시간정보를 하나로 표현 
		
		Date today = new Date();
		
		System.out.println(today);	// today.toString()
		
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy.MM.dd.a HH:mm:ss");
									//연도.달.날.오전오후 시간 분 초
		System.out.println(dateFormat.format(today));

	}
	
	
	

}
