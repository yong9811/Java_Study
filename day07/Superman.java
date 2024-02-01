package day07;

public class Superman {
	String name;//이름
	int height;//키
	int power;//초능력
	
	public Superman() {//기본 생성자
		this("슈퍼맨",155,100);
//		name="슈퍼맨";
//		height=155;
//		power=100;
	}
	
	public Superman(String name) {
		this(name,160);
//		this.name=name;
//		height=160;
//		power=200;
	}
	
	public Superman(String name, int height) {
//		System.out.println("생성자 호출됨...");
		this(name, height, 300);
//		this.name=name;
//		this.height=height;
//		this.power=300;
	}
	
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public void showInfo() {
//		this("aa",1,2); 생성자 안에서 호출 가능
		System.out.println("이름: "+name);
		System.out.println("키: "+height);
		System.out.println("초능력: "+power);
	}
}
