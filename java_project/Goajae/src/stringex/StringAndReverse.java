package stringex;

public class StringAndReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="ABCDEFGHIJKLMN";
		
		StringBuffer reverse = new StringBuffer();
        reverse.append(str);
        System.out.println("정방향"+str);
        System.out.println("역방향"+reverse.reverse());
    }   
	}

