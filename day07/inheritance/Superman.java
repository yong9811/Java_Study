package day07.inheritance;
//자식클래스
public class Superman extends Human {
	int power;
	public Superman() {
		this("아무개",177,150);
	}
	
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("초능력: "+power);
	}
	
	public void showInfo(String title) {
		System.out.println(title);
		this.showInfo();
	}
	
	public String showInfo(String title, int up) {
		this.showInfo(title);
		power+=up;
		return "초능력을 충전했어요: 현재 초능력은 "+power+"입니다<<";
	}
}
