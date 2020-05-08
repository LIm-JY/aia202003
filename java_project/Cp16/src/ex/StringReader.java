package ex;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class StringReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("news.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		
		while(true) {
			str=br.readLine();
			
			if(str==null) {
				break;
			}
			System.out.println(str);
					
	}
		br.close();
}
}