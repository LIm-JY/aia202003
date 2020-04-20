package ex1;

public class MyMathMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=25, b=3;
		MyMath math = new MyMath();
		int add = math.add(a, b);
		int sub = math.sub(a, b);
		int mul = math.mul(a, b);
		int div = math.div(a, b);
		int num = math.num;
		System.out.println("더하기"+add);
		System.out.println("빼기"+sub);
		System.out.println("곱하기"+mul);
		System.out.println("나누기"+div);
		System.out.println("나머지"+num);
	}

}
