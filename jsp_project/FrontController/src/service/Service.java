package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {
	
	// ��� �޼��尡 ��� �߻� �޼����̴�.
	// ��� ���� ���
	// view page ��ȯ�޼���
	// ����� ��û�� �ٽ� ó��
	// request �Ӽ��� ������ ����
	String getViewPage(HttpServletRequest request, HttpServletResponse response);
	
	
}
