package ex;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1부터 10까지의 합
	// 반복 +1씩
	//연산의 합을 담는 변수
	int sum = 0;
	
	for(int i=1;i<=10;i++) {
		//System.out.println(i);
		sum += i;
	}
	
	System.out.println("1부터 10까지의 숫자의 합"+ sum);
	{
	sum =0;
	int i =1;
	while(i<=10) {
		//System.out.println(i);
		sum += i;
		i++;
	}
	System.out.println("1부터 10까지의 숫자의 합"+sum);
	}
	}
}
