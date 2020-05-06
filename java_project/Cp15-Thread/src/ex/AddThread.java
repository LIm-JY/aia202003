package ex;

public class AddThread extends Thread {
	
	
	Sum sumInst;
	long start;
	long end;

	public AddThread(Sum sum, long s, long e) {
		// TODO Auto-generated constructor stub
		sumInst=sum;
		start=s;
		end=e;
	}
	@Override
	public void run() {
		for(long i=start;i<=end;i++) {
			sumInst.addNum(i);
		}
	}
}
