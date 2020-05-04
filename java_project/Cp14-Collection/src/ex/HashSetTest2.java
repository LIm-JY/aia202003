package ex;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<SimpleNumber> set = new HashSet<SimpleNumber>();
		//HashSet<String> set = new HashSet<>();
		//Set<String> set = new HashSet<>();
		
		
		set.add(new SimpleNumber(10));
		set.add(new SimpleNumber(20));
		set.add(new SimpleNumber(10));

		
		System.out.println("저장된 데이터의 개수 : "+ set.size());
		
		Iterator<SimpleNumber> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

class SimpleNumber{
	
	int num;
	
	public SimpleNumber(int num) {
		this.num=num;
		
	}
	
	public String toString() {
		
		return String.valueOf(num);
	}

	//HashSet의 동등 비교과정
	//1. hash코드를 비교 hash코드를 가진 객체를 기반으로 비교
	//2. equals 메서드로 비교
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.num/2;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		//num의 값을 비교
		if(obj instanceof SimpleNumber) {
			SimpleNumber sm = (SimpleNumber)obj;
			result = this.num == sm.num;
		}
		
		
		
		
		
		return result;
	}
	
}