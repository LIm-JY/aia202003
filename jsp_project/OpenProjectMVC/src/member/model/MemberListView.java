package member.model;

import java.util.List;

public class MemberListView {
	
	private int memberTotalCount;
	private int currentPageNumber;
	private List<Member> memberList;
	private int pageTotalCount;
	private int memberCountPerpage;
	private int startRow;
	
	
	public MemberListView(int memberTotalCount, int currentPageNumber, List<Member> memberList,
			int memberCountPerpage, int startRow) {
		this.memberTotalCount = memberTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.memberList = memberList;
		this.memberCountPerpage = memberCountPerpage;
		this.startRow = startRow;
	}


	public MemberListView() {
	}
	
	private void calTotalCount() {
		if(memberTotalCount==0) {
			pageTotalCount = 0;
		} else {
			pageTotalCount = memberTotalCount/memberCountPerpage;
			System.out.println(memberTotalCount%memberCountPerpage);
			if(memberTotalCount%memberCountPerpage > 0) {
				pageTotalCount ++;
			}
			System.out.println(pageTotalCount);
		}
	}


	public int getMemberTotalCount() {
		return memberTotalCount;
	}


	public void setMemberTotalCount(int memberTotalCount) {
		this.memberTotalCount = memberTotalCount;
	}


	public int getCurrentPageNumber() {
		return currentPageNumber;
	}


	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}


	public List<Member> getMemberList() {
		return memberList;
	}


	public void setMemberList(List<Member> memberList) {
		this.memberList = memberList;
	}


	public int getPageTotalCount() {
		return pageTotalCount;
	}


	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}


	public int getMemberCountPerpage() {
		return memberCountPerpage;
	}


	public void setMemberCountPerpage(int memberCountPerpage) {
		this.memberCountPerpage = memberCountPerpage;
	}


	public int getStartRow() {
		return startRow;
	}


	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}


	@Override
	public String toString() {
		return "MemberListView [memberTotalCount=" + memberTotalCount + ", currentPageNumber=" + currentPageNumber
				+ ", memberList=" + memberList + ", pageTotalCount=" + pageTotalCount + ", memberCountPerpage="
				+ memberCountPerpage + ", startRow=" + startRow + "]";
	}
	
	
	
	
	
	
	
	
	
}
