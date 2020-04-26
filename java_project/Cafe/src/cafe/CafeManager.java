package cafe;

import java.util.Scanner;

public class CafeManager {

	final CafeInfor[] board;
	final CafeInfor[] board2;
	final CafeInfor[] board3;
	final CafeInfor[] board4;
	int cnt, cnt2, cnt3, cnt4;

	Scanner sc;

	public CafeManager() {
		// 배열 초기화
		board = new CafeInfor[100];
		board2 = new CafeInfor[100];
		board3 = new CafeInfor[100];
		board4 = new CafeInfor[100];
		// cnt초기화
		cnt = 0;
		cnt2 = 0;
		cnt3 = 0;
		cnt4 = 0;
		// sc초기화
		sc = new Scanner(System.in);
	}

	void addInfo(CafeInfor info) {

		board[cnt++] = info;

	}

	void addInfo() {
		board[cnt++] = createInstance();
	}

	// 사용자의 입력데이터로 CafeInfor 객체를 생성
	CafeInfor createInstance() {

		CafeInfor info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("게시글을 작성하기 위한 데이터를 입력합니다");
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();

		System.out.println("작성자를 입력하세요: ");
		String name = sc.nextLine();

		System.out.println("내용을 입력하세요: ");
		String memo = sc.nextLine();

		if (true) {
			info = new CafeInfor(title, name, memo);
		}

		return info;

	}

	// 전체 게시판 출력
	void showAllData() {

		for (int i = 0; i < cnt; i++) {
			board[i].showInfor();
			System.out.println("---------------------");
		}
	}// 기본정보출력

	void showData() {
		for (int i = 0; i < cnt; i++) {
			board[i].showTitle();

		}
	}

	// 검색기능
	int searchIndex(String title) {

		int searchIndex = -1;

		// 사용자가 입력한 게시판 타이틀로 배열의 요소검색
		for (int i = 0; i < cnt; i++) {
			if (board[i].checkTitle(title)) {
				searchIndex = i;
				break;
			}
		}
		return searchIndex;

	}

	// 검색: 타이틀을 기준으로 데이터를 찾아 해당 데이터의 정보를 추력
	// 배열의요소(PhoneInfor)의 title속성 값으로
	void searchInfo() {

		System.out.println("검색하고자하는 게시글을 입력하세요");
		String title = sc.nextLine();

		int searchIndex = searchIndex(title);

		if (searchIndex < 0) {
			System.out.println("데이터 없음");
		} else {
			board[searchIndex].showInfor();
		}
		System.out.println("-------------------");

	}

	// 삭제기능
	void deleteInfo() {

		System.out.println("삭제하고자 하는 게시글을 입력해주세요");
		String title = sc.nextLine();

		int searchIndex = searchIndex(title);
		// 삭제
		// board[2]: 삭제, board[2] = null
		// 데이터 삭제 후 남아있는 데이터를 빈 공란없이 순차적으로
		// 재정리 2번이 삭제되면 이후 주소값들이 -1처리

		if (searchIndex < 0) {
			System.out.println("찾는 데이터가 없습니다");
		} else {
			// 삭제: 검색한 index부터 지정한 위치까지 왼쪽으로 시프트
			for (int i = searchIndex; i < cnt - 1; i--) {
				board[i] = board[i + 1];
			}
			cnt--;

			System.out.println("삭제 되었습니다");
		}
	}

	// 게시판 기능
	void showMenuInfo() {
		while (true) {
			// 게시판 출력
			showData();
			Menu.showMenu();

			String selectNum = sc.nextLine();

			sc.nextLine();

			switch (selectNum) {
			case "1":
				// 배열정보 저장

				addInfo();
				break;
			// 게시글 검색
			case "2":
				searchInfo();
				break;
			// 게시글 삭제
			case "3":
				deleteInfo();
				break;
			// 종료
			case "4":
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}
//게시판2=============================================================================
//===================================================================================

	void addInfo2(CafeInfor info) {

		board2[cnt2++] = info;
	}

	void addInfo2() {
		board2[cnt2++] = createInstance2();
	}

	// 사용자의 입력데이터로 CafeInfor 객체를 생성
	CafeInfor createInstance2() {

		CafeInfor info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("게시글을 작성하기 위한 데이터를 입력합니다");
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();

		System.out.println("작성자를 입력하세요: ");
		String name = sc.nextLine();

		System.out.println("내용을 입력하세요: ");
		String memo = sc.nextLine();

		if (true) {
			info = new CafeInfor(title, name, memo);
		}

		return info;

	}

	// 전체 게시판 출력
	void showAllData2() {

		for (int i = 0; i < cnt2; i++) {
			board2[i].showInfor2();
			System.out.println("---------------------");
		}
	}// 기본정보출력

	void showData2() {
		for (int i = 0; i < cnt2; i++) {
			board2[i].showTitle2();

		}
	}

	// 검색기능
	int searchIndex2(String title) {

		int searchIndex2 = -1;

		// 사용자가 입력한 게시판 타이틀로 배열의 요소검색
		for (int i = 0; i < cnt2; i++) {
			if (board2[i].checkTitle(title)) {
				searchIndex2 = i;
				break;
			}
		}
		return searchIndex2;

	}

	// 검색: 타이틀을 기준으로 데이터를 찾아 해당 데이터의 정보를 추력
	// 배열의요소(PhoneInfor)의 title속성 값으로
	void searchInfo2() {

		System.out.println("검색하고자하는 게시글을 입력하세요");
		String title = sc.nextLine();

		int searchIndex2 = searchIndex2(title);

		if (searchIndex2 < 0) {
			System.out.println("데이터 없음");
		} else {
			board2[searchIndex2].showInfor();
		}
		System.out.println("-------------------");

	}

	// 삭제기능
	void deleteInfo2() {

		System.out.println("삭제하고자 하는 게시글을 입력해주세요");
		showData2();
		String title = sc.nextLine();
		
		

		int searchIndex2 = searchIndex2(title);
		// 삭제
		// board[2]: 삭제, board[2] = null
		// 데이터 삭제 후 남아있는 데이터를 빈 공란없이 순차적으로
		// 재정리 2번이 삭제되면 이후 주소값들이 -1처리

		if (searchIndex2 < 0) {
			System.out.println("찾는 데이터가 없습니다");
		} else {
			// 삭제: 검색한 index부터 지정한 위치까지 왼쪽으로 시프트
			for (int i = searchIndex2; i < cnt2 - 1; i--) {
				board2[i] = board2[i + 1];
			}
			cnt--;

			System.out.println("삭제 되었습니다");
		}
	}

	// 게시판 기능
	void showMenuInfo2() {
		while (true) {
			// 게시판 출력
			showData2();
			Menu.showMenu();

			int selectNum = sc.nextInt();

			sc.nextLine();

			switch (selectNum) {
			case 1:
				// 배열정보 저장

				addInfo2();
				break;
			// 게시글 검색
			case 2:
				searchInfo2();
				break;
			// 게시글 삭제
			case 3:
				deleteInfo2();
				break;
			// 종료
			case 4:
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
//게시판3===================================================================
//게시판3===================================================================

	}

	void addInfo3(CafeInfor info) {

		board3[cnt3++] = info;
	}

	void addInfo3() {
		board3[cnt3++] = createInstance3();
	}

	// 사용자의 입력데이터로 CafeInfor 객체를 생성
	CafeInfor createInstance3() {

		CafeInfor info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("게시글을 작성하기 위한 데이터를 입력합니다");
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();

		System.out.println("작성자를 입력하세요: ");
		String name = sc.nextLine();

		System.out.println("내용을 입력하세요: ");
		String memo = sc.nextLine();

		if (true) {
			info = new CafeInfor(title, name, memo);
		}

		return info;

	}

	// 전체 게시판 출력
	void showAllData3() {

		for (int i = 0; i < cnt3; i++) {
			board3[i].showInfor3();
			System.out.println("---------------------");
		}
	}// 기본정보출력

	void showData3() {
		for (int i = 0; i < cnt3; i++) {
			board3[i].showTitle3();

		}
	}

	// 검색기능
	int searchIndex3(String title) {

		int searchIndex3 = -1;

		// 사용자가 입력한 게시판 타이틀로 배열의 요소검색
		for (int i = 0; i < cnt3; i++) {
			if (board3[i].checkTitle(title)) {
				searchIndex3 = i;
				break;
			}
		}
		return searchIndex3;

	}

	// 검색: 타이틀을 기준으로 데이터를 찾아 해당 데이터의 정보를 추력
	// 배열의요소(PhoneInfor)의 title속성 값으로
	void searchInfo3() {

		System.out.println("검색하고자하는 게시글을 입력하세요");
		String title = sc.nextLine();

		int searchIndex3 = searchIndex3(title);

		if (searchIndex3 < 0) {
			System.out.println("데이터 없음");
		} else {
			board3[searchIndex3].showInfor();
		}
		System.out.println("-------------------");

	}

	// 삭제기능
	void deleteInfo3() {

		System.out.println("삭제하고자 하는 게시글을 입력해주세요");
		String title = sc.nextLine();

		int searchIndex3 = searchIndex3(title);
		// 삭제
		// board[2]: 삭제, board[2] = null
		// 데이터 삭제 후 남아있는 데이터를 빈 공란없이 순차적으로
		// 재정리 2번이 삭제되면 이후 주소값들이 -1처리

		if (searchIndex3 < 0) {
			System.out.println("찾는 데이터가 없습니다");
		} else {
			// 삭제: 검색한 index부터 지정한 위치까지 왼쪽으로 시프트
			for (int i = searchIndex3; i < cnt3 - 1; i--) {
				board3[i] = board3[i + 1];
			}
			cnt3--;

			System.out.println("삭제 되었습니다");
		}
	}

	// 게시판 기능
	void showMenuInfo3() {
		while (true) {
			// 게시판 출력
			showData3();
			Menu.showMenu();

			int selectNum = sc.nextInt();

			sc.nextLine();

			switch (selectNum) {
			case 1:
				// 배열정보 저장

				addInfo3();
				break;
			// 게시글 검색
			case 2:
				searchInfo3();
				break;
			// 게시글 삭제
			case 3:
				deleteInfo3();
				break;
			// 종료
			case 4:
				
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}
	// 게시판4===================================================================
	// 게시판4===================================================================

	void addInfo4(CafeInfor info) {

		board4[cnt4++] = info;
	}

	void addInfo4() {
		board4[cnt4++] = createInstance3();
	}

	// 사용자의 입력데이터로 CafeInfor 객체를 생성
	CafeInfor createInstance4() {

		CafeInfor info = null;

		Scanner sc = new Scanner(System.in);

		System.out.println("게시글을 작성하기 위한 데이터를 입력합니다");
		System.out.println("제목을 입력하세요");
		String title = sc.nextLine();

		System.out.println("작성자를 입력하세요: ");
		String name = sc.nextLine();

		System.out.println("내용을 입력하세요: ");
		String memo = sc.nextLine();

		if (true) {
			info = new CafeInfor(title, name, memo);
		}

		return info;

	}

	// 전체 게시판 출력
	void showAllData4() {

		for (int i = 0; i < cnt4; i++) {
			board4[i].showInfor4();
			System.out.println("---------------------");
		}
	}// 기본정보출력

	void showData4() {
		for (int i = 0; i < cnt4; i++) {
			board4[i].showTitle4();

		}
	}

	// 검색기능
	int searchIndex4(String title) {

		int searchIndex4 = -1;

		// 사용자가 입력한 게시판 타이틀로 배열의 요소검색
		for (int i = 0; i < cnt4; i++) {
			if (board4[i].checkTitle(title)) {
				searchIndex4 = i;
				break;
			}
		}
		return searchIndex4;

	}

	// 검색: 타이틀을 기준으로 데이터를 찾아 해당 데이터의 정보를 추력
	// 배열의요소(PhoneInfor)의 title속성 값으로
	void searchInfo4() {

		System.out.println("검색하고자하는 게시글을 입력하세요");
		String title = sc.nextLine();

		int searchIndex4 = searchIndex4(title);

		if (searchIndex4 < 0) {
			System.out.println("데이터 없음");
		} else {
			board4[searchIndex4].showInfor();
		}
		System.out.println("-------------------");

	}

	// 삭제기능
	void deleteInfo4() {

		System.out.println("삭제하고자 하는 게시글을 입력해주세요");
		String title = sc.nextLine();

		int searchIndex4 = searchIndex4(title);
		// 삭제
		// board[2]: 삭제, board[2] = null
		// 데이터 삭제 후 남아있는 데이터를 빈 공란없이 순차적으로
		// 재정리 2번이 삭제되면 이후 주소값들이 -1처리

		if (searchIndex4 < 0) {
			System.out.println("찾는 데이터가 없습니다");
		} else {
			// 삭제: 검색한 index부터 지정한 위치까지 왼쪽으로 시프트
			for (int i = searchIndex4; i < cnt4 - 1; i--) {
				board4[i] = board4[i + 1];
			}
			cnt4--;

			System.out.println("삭제 되었습니다");
		}
	}

	// 게시판 기능
	void showMenuInfo4() {
		while (true) {
			// 게시판 출력
			showData4();
			Menu.showMenu();

			int selectNum = sc.nextInt();

			sc.nextLine();

			switch (selectNum) {
			case 1:
				// 배열정보 저장

				addInfo4();
				break;
			// 게시글 검색
			case 2:
				searchInfo4();
				break;
			// 게시글 삭제
			case 3:
				deleteInfo4();
				break;
			// 종료
			case 4:

				return;
			default:
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}

	}
}