package ex4;

public class PrimeNumber {
	//전달되는 값이 소수(prime number)인지 아닌지를 판단하여, 
	//소수인경우 true를, 소수가 아닌 경우 false를 반환하는 메서드를 정의하고, 
	//이를 이용해서 1이상 100 이하의 소수를 전부 출력할 수 있도록 main 메서드를 정의하자.

	boolean PrimeNumber(int n) {
	  boolean primenumber = true;
	  	for (int i=2; i<n; i++) {
	  		if (n%i==0){
	  			primenumber = false;
	  			break;
	  }
}
	  if (primenumber) {
	   return true;

	  } else {
	   return false;
	  }

	}
}