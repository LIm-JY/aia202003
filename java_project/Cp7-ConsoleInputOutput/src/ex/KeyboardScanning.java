package ex;

import java.util.Scanner;

public class KeyboardScanning {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);	// ctrl+shift+o 를 누르게 되면 import처리가 됨
											//or ctrl space
		
		System.out.println("숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		int num2 = sc.nextInt();
		System.out.println("숫자를 입력하세요");
		int num3 = sc.nextInt();
		
		int sum = num1+num2+num3;
		int mul = num1*num2*num3;
		System.out.printf(
		"입력된 정수 %d, %d, %d 입니다."+ " 숫자들의 합은 %d 입니다.",
		num1,num2,num3,sum);
		System.out.printf(
				"입력된 정수 %d, %d, %d 입니다."+ " 숫자들의 곱은 %d 입니다.",
				num1,num2,num3,mul);

	

}
	
}