package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {
	
	// 멤버 메서드가 모두 추상 메서드이다.
	// 멤버 변수 상수
	// view page 반환메서드
	// 사용자 요청의 핵심 처리
	// request 속성에 데이터 저장
	String getViewPage(HttpServletRequest request, HttpServletResponse response);
	
	
}
