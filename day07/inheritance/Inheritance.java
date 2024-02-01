package day07.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Human h1=new Human();
		h1.name="아무개";
		h1.height=166;
		h1.showInfo();
		
		System.out.println("--------------------");
		Superman s1=new Superman();
		s1.showInfo();
		
		Superman s2=new Superman("손흥민",180,200);
		s2.showInfo();
		
		Aquaman a=new Aquaman("아쿠아맨", 179, 123.123);
		a.showInfo();
		
		s1.showInfo("###슈퍼맨 정보###");
		
		s2.showInfo("@@@슈퍼맨 정보@@@");
		
		String str=s2.showInfo("***울트라 슈퍼맨***", 500);
		System.out.println(str);
		
		//상속관계를 맺으면
		//부모타입의 변수 선언 = new 자식객체(); 가능함
		//이때 이 참조변수로 접근할 수 있는 변수나 메서드는 제한이 있다.
		//[1] 부모가 물려준 변수,메서드는 접근 가능
		//[2] 그러나 오버라이드한 메서드가 있을 경우에는 자식의 오버라이드한 메서드를 적용한다
		//[3] 자식만이 갖는 고유한 변수나 메서드는 접근 할 수 없다.
		Human hs=new Superman("김초롱",175,850);
		
		System.out.println("hs.name: "+hs.name);
		System.out.println("hs.height: "+hs.height);
//		System.out.println("hs.power: "+hs.power);
		
		System.out.println("((Superman)hs).power: "+((Superman)hs).power);
		
		hs.showInfo();
		
//		hs.showInfo("***슈퍼맨 정보***");
		
		((Superman)hs).showInfo("***슈퍼맨 정보***");
		
		Human ha=new Aquaman("김똘똘", 165, 45);
		System.out.println("ha.name: "+ha.name);
		System.out.println("ha.height: "+ha.height);
		System.out.println("((Aquaman)ha).speed: "+((Aquaman)ha).speed);
		
		ha.showInfo();
		// h, s,a, hs,ha 객체들을 저장할 배열을 생성하고 저장하세요
		// 그런뒤 반복문 이용해서 배열에 저장된 객체들의 showInfo()를 호출하세요
		
		Human[] arr= {h1,s1,a,hs,ha};
		for (int i = 0; i < arr.length; i++) {
			arr[i].showInfo();
		}
		
		
	}

}
