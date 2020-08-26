package com.aia.it.member.model;

public class LoginInfo {
	
	private String uid;
	private String upw;
	private String uname;
	private String uphonenum;
	private String uphoto;
	
	public LoginInfo() {
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUphonenum() {
		return uphonenum;
	}

	public void setUphonenum(String uphonenum) {
		this.uphonenum = uphonenum;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	public LoginInfo(String uid, String upw, String uname, String uphonenum, String uphoto) {
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.uphonenum = uphonenum;
		this.uphoto = uphoto;
	}

	@Override
	public String toString() {
		return "LoginInfo [uid=" + uid + ", upw=" + upw + ", uname=" + uname + ", uphonenum=" + uphonenum + ", uphoto="
				+ uphoto + "]";
	}
	
	

}
