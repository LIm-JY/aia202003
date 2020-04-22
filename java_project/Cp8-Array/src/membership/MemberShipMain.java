package membership;

public class MemberShipMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//회원정보 5개를 저장할 수 있는 배열을 생성	-> Member[]members = new Member[5];
		//Member 타입의 인스턴스의 참조값을 저장하는 메모리 공간
		//Member m1, m2, m3, m4, m5
		Member[]members = new Member[5];
		
		members[0]= new Member("tkfkd0312", "주사랑", "love0312@naver.com");	//Member타입의 인스턴스 주소
		members[1]= new Member("lgrnsdk", "임재영", "lgrnsdk@naver.com");
		members[2]= new Member("pretty", "이쁨", "pretty@naver.com");
		members[3]= new Member("cute", "귀여움", "cute@naver.com");
		members[4]= new Member("ugly","못생김","ugly@naver.com");
		
//		members[0].showInfo();
//		members[1].showInfo();
//		members[2].showInfo();
//		members[3].showInfo();
//		members[4].showInfo(); 아래의 반복문으로 처리가능함
		
		for(int i=0; i<members.length;i++) {
			System.out.println(members[i]);
		}
		System.out.println("----------------------------------");
		for(int i=0; i<members.length;i++) {
			members[i].showInfo();
			System.out.println("----------------------");
		}
		
		
//		Member member = new Member("tkfkd0312", "주사랑", "love0312@naver.com");
//		
//		member.showInfo();
//		
//		System.out.println("----------------");
//		System.out.println(member);	// member.toString() 호출
		
	}

}
