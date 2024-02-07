package day11;

public class ThreadTest2 {

	public static void main(String[] args) {
		ClockRunnable cr=new ClockRunnable();
		
		Thread tr=new Thread(cr);
		tr.start();
	}

}
