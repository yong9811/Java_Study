package day05;

public class House {
		int room;
		String owner;
		String addr;
	static int count;
	
	public void printInfo() {
		System.out.println("---House정보----");
		System.out.println("소유주: "+owner);
		System.out.println("방  수: "+room);
		System.out.println("주  소: "+addr);
	}
	
	public String rent(String type, int price) {
		String str="";
		str="---"+owner+"의 집----\n";
		str+="거래 유형: "+type+"\n";
		str+="가    격: "+price+"만원\n";
		return str;
		
	}
}
