package day11;

public class SnailThread2 extends Thread{
	public SnailThread2(String name) {
		this.setName(name);
	}
	
	@Override
	public void run() {
		for(int x=100;x>=0;x--) {
			System.out.println(getName()+"가 뒤로 기어감: "+x);
			
			try {
				Thread.sleep(20);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
