package ex;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j=0; //j는 합
		while(i<1001) {
			if(i%2==0 && i%7==0) {
				System.out.println(i);
				j+=i;
			}
		i++;
		}
		System.out.println("-------------------");
		System.out.println(j);

	}

}
