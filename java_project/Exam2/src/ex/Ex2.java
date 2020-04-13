package ex;

public class Ex2 {
	public static void main(String[]args) {
		//두 수의 차 구하기 - 절대값을 이용하는 방법
		int a=5, b=6;
        int result;

        result=(a-b);


        if(result<0)

            result=(-result);
     
        System.out.println("두 수의 차의 절대값은 : "+result);


	}

}
