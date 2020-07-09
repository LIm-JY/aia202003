package guestbook.model;

import java.util.List;

public class MessageListView {
	
	// ��ü �Խù��� ����
	private int messageTotalCount;
	// ���� ������ ��ȣ
	private int currentPageNumber;
	// �޽��� ����Ʈ
	private List<Message> messageList;
	// ��ü �������� ����
	private int pageTotalCount;
	// ������ �� ǥ�� �Խù��� ����
	private int messageCountPerpage;
	// �Խù��� ���� ��
	private int startRow;
	// �Խù��� ������ ��
	private int endRow;
	
	public MessageListView(
			int messageTotalCount, 
			int currentPageNumber, 
			List<Message> messageList,
			int messageCountPerpage, 
			int startRow, 
			int endRow) {
		this.messageTotalCount = messageTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.messageList = messageList;
		this.messageCountPerpage = messageCountPerpage;
		this.startRow = startRow;
		this.endRow = endRow;
		calTotalPageCount();
	}
	
	// new MessageListView();
	
	private void calTotalPageCount() {
		
		if(messageTotalCount == 0) {
			pageTotalCount=0;
		} else {
			pageTotalCount = messageTotalCount/messageCountPerpage;
			if(messageTotalCount%messageCountPerpage>0) {
				pageTotalCount++;
			}
		}
		
	}

	public int getMessageTotalCount() {
		return messageTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public int getMessageCountPerpage() {
		return messageCountPerpage;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	@Override
	public String toString() {
		return "MessageListView [messageTotalCount=" + messageTotalCount + ", currentPageNumber=" + currentPageNumber
				+ ", messageList=" + messageList + ", pageTotalCount=" + pageTotalCount + ", messageCountPerpage="
				+ messageCountPerpage + ", startRow=" + startRow + ", endRow=" + endRow + "]";
	}
	
	public boolean isEmpty() {
		return messageTotalCount==0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}