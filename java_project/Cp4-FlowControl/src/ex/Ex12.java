package ex;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num = 1;
		 int sum = 0;
		 int count = 0;
		 
		  while(true) {
		   
		   if(num%2!=0||(num%3==0&&num%2==0)) {
		    sum+=num; 
		    count++; 
		   }
		   if(sum>1000) { 
		    System.out.println("횟수 :" + count); 
		    System.out.println("1000을 넘은 값 :" + sum);
		    break;
		   }
		   num++;

		}
		}
		}
		
