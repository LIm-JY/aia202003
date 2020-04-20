package ex2;

public class AbsValue {
	
	int num = 0;
	public int add(int a,int b) {
		return Math.abs(a+b);
		}
	public int sub(int a,int b) {
		return Math.abs(a-b);
		}
	public int mul(int a,int b) {
		return Math.abs(a*b);
		}
	public int div(int a,int b) {
		
		num = Math.abs(a%b);
		return Math.abs(a/b);
		
		}

}

