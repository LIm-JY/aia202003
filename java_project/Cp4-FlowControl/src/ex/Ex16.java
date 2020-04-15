package ex;

public class Ex16 {
	public static void main(String[]args ) {
		
		int n = 0;
		int sum = 0;
//		for(n=1; n<100; n++) {
//			sum = sum + n;
//			
//		}System.out.println(sum);
		
//		while(n<100) {
//			sum = sum+n;			
//			n++;
//		}System.out.println(sum);
		
		do {	
		sum=sum+n;
		n++;	
		}while(n<100);
		System.out.println(sum);
	}

}
