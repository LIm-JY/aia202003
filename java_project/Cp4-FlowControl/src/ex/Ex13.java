package ex;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			System.out.println("-----------");
			for(int j =1; j<=9; j++) {
				if(i%2==0&&i%6!=0)
				System.out.println(i+"X"+j+"="+i*j);
			}
			System.out.println("-----------");
		}
		
	}

}
