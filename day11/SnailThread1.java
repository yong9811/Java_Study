package day11;

public class SnailThread1 extends Thread{
	public SnailThread1(String name) {
		this.setName(name);
	}
	@Override
	public void run() {
		for(int x=0;x<=100;x++) {
			System.out.println(getName()+"가 앞으로 기어감: "+x);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("예외: "+e.getMessage());
			}
		}
	}
}
