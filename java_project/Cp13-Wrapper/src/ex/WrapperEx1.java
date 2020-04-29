package ex;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer("100");
		
		System.out.println("i1==i2:"+ (i1==i2));
		System.out.println("i1.equals(i2)"+i1.equals(i2));
		
		System.out.println("i1.to`String(): "+i1.toString());
		System.out.println("i2.to`String(): "+i2.toString());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
	}

}
