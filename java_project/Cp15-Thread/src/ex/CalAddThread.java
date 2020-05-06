package ex;

public class CalAddThread extends Thread {

	
	Calculator cal;
	
	public CalAddThread(Calculator c) {
		cal=c;
	}

	@Override
	public void run() {
		System.out.println(cal.add(1, 2));
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cal.add(2, 4));
	}
	
}
