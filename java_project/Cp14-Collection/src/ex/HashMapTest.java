package ex;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//입력
		map.put(1, "일번");
		map.put(2, "이번");
		map.put(3, "삼번");
		map.put(8, "팔번");
		//참조
		System.out.println("1번 학생의 이름은: "+map.get(1));
		System.out.println("8번 학생의 이름은: "+map.get(8));
		
		//삭제
		map.remove(8);
		System.out.println("8번학생 삭제");
		System.out.println("8번 학생의 이름은: "+map.get(8));
		
		
		
		System.out.println(map.get(2));
		System.out.println("key=2인 데이터 중복입력");
		//key값은 중복허용이 되지 않는다.
		map.put(2, "two");
		System.out.println(map.get(2));
		
		
	}

}
