package ex2;

public class AbsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=-25, b=3;
		AbsValue value = new AbsValue();
		int add = value.add(a, b);
		int sub = value.sub(a, b);
		int mul = value.mul(a, b);
		int div = value.div(a, b);
		int num = value.num;
		System.out.println("더하기"+add);
		System.out.println("빼기"+sub);
		System.out.println("곱하기"+mul);
		System.out.println("나누기"+div);
		System.out.println("나머지"+num);
	}
	}

