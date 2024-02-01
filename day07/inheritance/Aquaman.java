package day07.inheritance;

public class Aquaman extends Human{
	double speed;
	
	public Aquaman(String n, int h, double s) {
		name=n;
		height=h;
		speed=s;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("스피드: "+speed);
	}
}
