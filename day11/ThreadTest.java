package day11;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException{
		SnailThread1 tr1=new SnailThread1("똘똘이 달팽이");
		SnailThread2 tr2=new SnailThread2("거꾸로 달팽이");
		tr1.setPriority(10);
		tr2.setPriority(3);
		tr1.start();
		tr2.start();
		tr1.join();
		System.out.println("Hello World");
		Thread tr3=Thread.currentThread();
		System.out.println(tr3.getName()+"스레드가 실행중...");
	}

}
