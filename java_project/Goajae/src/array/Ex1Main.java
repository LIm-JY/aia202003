package array;

import java.util.Scanner;

public class Ex1Main {

	public static void main(String[] args) {
		
		//배열 선언
		  int[] arr = new int[3];
		  //input기능
		  @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		  
		  for(int i=0; i<arr.length; i++) {
		   System.out.print("숫자를 입력해주세요:");
		   //output기능
		   arr[i] = sc.nextInt();
		  
		  }
		  
		  int max = Ex1.maxValue(arr);
		  int mini = Ex1.miniValue(arr);
		  
		  System.out.println("배열의 index: "+arr.length);
		  System.out.println("최소값: "+mini);
		  System.out.println("최대값: "+max);
	}
		
}
