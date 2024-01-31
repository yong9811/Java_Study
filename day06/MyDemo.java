package day06;

class Car{
		String color;
	static int capa;
	
	public void run(int km) {
		System.out.println(color+"색 자동차가 시속 "+km+"km로 달려요~~");
	}
	public static String info() {
		String str="---자동차 정보----\n";
		str+="용량: "+capa+"cc\n";
//		str+="색상: "+color+"색\n";
		return str;
	}
}

class Tv{
	
}

public class MyDemo {
	
	String str="나는 인스턴스 변수";
	static String str2="나는 클래스 변수";

	public static void main(String[] args) {
		System.out.println(MyDemo.str2);
		System.out.println(str2);
		
		MyDemo md=new MyDemo();
		System.out.println("md.str: "+md.str);
		
		Car car=new Car();
		
		System.out.println("car.color: "+car.color);
		System.out.println("Car.capa: "+Car.capa);
		
		car.color="red";
		Car.capa=2000;
		
		System.out.println("car.color: "+car.color);
		System.out.println("Car.capa: "+Car.capa);
		
		car.run(40);
		
		System.out.println(Car.info());
		
		Car car2=new Car();
		car2.color="black";
		Car.capa=3000;
		car2.run(130);
		System.out.println(Car.info());
		
		System.out.println("car.capa: "+car.capa);
		System.out.println("car2.capa: "+car2.capa);
	}

}
