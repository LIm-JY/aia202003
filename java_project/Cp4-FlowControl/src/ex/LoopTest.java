package ex;

public class LoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
	System.out.println("---------------------");
	
	for(int i=1; i<=50; i++) {
		System.out.println(i);
	}
	System.out.println("---------------------");
	
	int i = 1;

	while(i<51) {
		System.out.println(i);
		i++; //중요 별 5개
		}
		System.out.println("---------------------");
	i = 0;
	
	do {
		i++;
		System.out.println(i);
		}
	while(i<5);
		
	}
}

