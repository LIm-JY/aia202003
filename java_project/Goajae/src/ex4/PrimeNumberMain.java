package ex4;

public class PrimeNumberMain {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  PrimeNumber number= new PrimeNumber();
		  int n = 0;
		  for (n=2;n<=100;n++) 
		  {
		  boolean pNum = number.PrimeNumber(n);
		  if (pNum==true) 
		  {
		  System.out.println(n+": 소수");
		  }
		  else {
			  System.out.println(n+": 소수가아님");
		  }
		  }
	}
	
}



