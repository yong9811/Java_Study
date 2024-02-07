package day11;

import java.util.Scanner;

interface Animal{
	void getBaby(int num);
	String crySound();
}

class Dog implements Animal
{

	@Override
	public void getBaby(int num) {
		System.out.println(num+"마리의 새끼를 낳았어요");
	}

	@Override
	public String crySound() {
		return "멍멍~~";
	}
	
}
class Cat implements Animal
{
	@Override
	public void getBaby(int num) {
		System.out.println(num+"마리의 새끼를 낳았어요");
	}

	@Override
	public String crySound() {
		return "야옹야옹~~";
	}
}
class Duck implements Animal
{
	@Override
	public void getBaby(int num) {
		System.out.println(num+"개의 알을 낳았어요");
	}

	@Override
	public String crySound() {
		return "꽥꽥~~";
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("동물 유형을 입력하세요 [강아지, 고양이, 오리]");
		String animal = sc.next();
		
		System.out.println("마리수를 입력하세요");
		int num = sc.nextInt();
				
		Animal a;
		
		if(animal.equals("강아지")) {
			a = new Dog();
		}
		else if(animal.equals("고양이")) {
			a = new Cat();
		}
		else if(animal.equals("오리")) {
			a = new Duck();
		}
		else {
			return;
		}
		
		System.out.println(a.crySound());
		a.getBaby(num);
	}

}
