package friend;

import java.util.Scanner;

public class FriendInfoHandler {
	
	//Friend 타입의 정보를 저장할 배열을 가진다.
	//친구정보를 저장하는 기능
	//친구정보의 기본정보 출력
	//친구정보의 상세정보 출력
	
	private Friend[]myFriends;	//Friend타입의 배열선언
	private int numOfFriend;	//저장된 친구의 정보개수
	Scanner sc;
	
	//초기화: 저장공간(사이즈) 크기를 받아서 배열 생성
	FriendInfoHandler(int num) {
		myFriends = new Friend[num];
		numOfFriend=0;
		sc = new Scanner(System.in);
	}
	
	//친구정보를 저장하는 기능
	//1.배열에 저장하는기능
	//2.사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	
	//1.배열에 저장하는기능
	void addFriendInfo(Friend f) {
		//배열에 저장
		myFriends[numOfFriend]=f;
		numOfFriend++;
	}
	//2.사용자에게 데이터를 받아 사용자 요청에 맞는 인스턴스 생성
	//HighFriend / UnivFriend
	void addFreind(int choice) {
		
		//기본정보 받기
		System.out.println("이름을 입력해주세요: ");
		String name = sc.nextLine();
		System.out.println("번호를 입력해주세요: ");
		String phoneNum = sc.nextLine();
		System.out.println("주소를 입력해주세요: ");
		String addr = sc.nextLine();
		
		Friend friend = null;
		
		if(choice == 1) {
			//1. 일때 정보받기
			System.out.println("직업을 입력해주세요->... ");
			String work = sc.nextLine();
			//HighFreind 인스턴스 생성
			friend = new HighFriend(name, phoneNum, addr, work);
			//Integer.parseInt(grade) : String -> int로 반환
			
		}else {
			//2. 일때 정보받기
			System.out.println("전공을 입력해주세요->... ");
			String major = sc.nextLine();
			System.out.println("학년을 입력해주세요->... ");
			String grade = sc.nextLine();
			
			//UnivFreind 인스턴스 생성
			friend = new UnivFriend(name, phoneNum, addr, major, Integer.parseInt(grade));
		
			
		}
		
			
		//addFriendInfo호출
		addFriendInfo(friend);
		
		
		
		
		
		
		
		
		
	}
	//친구정보 출력기능
	void ShowAllSimpleData() {
		
		System.out.println("친구의 기본정보를 출력합니다.");
		for(int i=0;i<numOfFriend;i++) {
			myFriends[i].showBasicInfo();
			System.out.println("-----------------");
			
		}
	}
	//친구정보 상세정보출력기능
	void ShowALlData() {
		System.out.println("친구의 상세정보를 출력합니다.");
		for(int i=0;i<numOfFriend;i++) {
			myFriends[i].showData();
			System.out.println("------------------");
		}
	}
	
}
