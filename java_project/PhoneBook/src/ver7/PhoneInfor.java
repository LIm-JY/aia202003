package ver7;

public class PhoneInfor {
	
	private String pbname;
	private String pbnumber;
	private String pbaddr;
	private String pbmail;
	private String pbtype;
	public PhoneInfor() {
		
	}
	public PhoneInfor(String pbname, String pbnumber, String pbaddr, String pbmail) {
		super();
		this.pbname = pbname;
		this.pbnumber = pbnumber;
		this.pbaddr = pbaddr;
		this.pbmail = pbmail;
	}
	
	public String getPbname() {
		return pbname;
	}
	public void setPbname(String pbname) {
		this.pbname = pbname;
	}
	public String getPbnumber() {
		return pbnumber;
	}
	public void setPbnumber(String pbnumber) {
		this.pbnumber = pbnumber;
	}
	public String getPbaddr() {
		return pbaddr;
	}
	public void setPbaddr(String pbaddr) {
		this.pbaddr = pbaddr;
	}
	public String getPbmail() {
		return pbmail;
	}
	public void setPbmail(String pbmail) {
		this.pbmail = pbmail;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public String getPbtype() {
		return pbtype;
	}
	public void setPbtype(String pbtype) {
		this.pbtype = pbtype;
	}
	
	
	
	

}
