package ex;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectSerialzableMain1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		//기본스트림
		FileInputStream fi = new FileInputStream("Object.ser");
		//파일에서 데이터를 추출 ->객제 역직렬화 필터스트림
		ObjectInputStream in = new ObjectInputStream(fi);
		
		Circle c1 = (Circle) in.readObject();
		Circle c2 = (Circle) in.readObject();
		String string = (String) in.readObject();
		
		c1.showCircleInfo();
		c2.showCircleInfo();
		System.out.println(string);
	}

}
