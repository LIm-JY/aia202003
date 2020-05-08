package ex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectSerialzableMain2 {

	public static void main(String[] args) throws IOException {


		//기본스트림
		FileOutputStream fo = new FileOutputStream("Object.ser");
		//객제저장필터스트림
		ObjectOutputStream out = new ObjectOutputStream(fo);
		
		out.writeObject(new Circle(1,2, 1.2));
		out.writeObject(new Circle(1,2, 1.2));
		out.writeObject(new String("String implements SErialzable"));
		out.close();
		
		System.out.println("인스턴스의 데이터가 저장되었습니다.");
		
	}

}
