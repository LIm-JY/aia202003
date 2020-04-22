package membership;


//회원정보를 저장하기 위한 클래스
public class Member {
	
	String memberId;
	String memberName;
	String memberEmail;
	
	//생성자 -인스턴스 변수를 초기화함
	Member(String memberId, String memberName, String memberEmail){
		this.memberId=memberId;
		this.memberName=memberName;
		this.memberEmail=memberEmail;
		
	}
	void showInfo() {
		System.out.println("I___D: "+this.memberId);
		System.out.println("NA_ME: "+this.memberName);
		System.out.println("Email: "+this.memberEmail);
	}
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", memberEmail=" + memberEmail + "]";
	}
		
	
	

}
