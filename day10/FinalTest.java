package day10;
/*
 * modifier
 * ----------------------------------------
 * 			abstract			final
 * ----------------------------------------
 * 클래스  |상속받게할 목적		| 상속받지 못하게 함
 * 메서드  |오버라이드할 목적		| 오버라이드 못하도록
 * 변수   |   x				| 값 할당 못하도록
 * ----------------------------------------
 * */
final class Parent{
	int a=10;
}
class Child
{
	void foo() {
		System.out.println("foo()");
	}
	final void bar() {
		System.out.println("bar()");
	}
}
class SubChild extends Child
{
	public static final double PI=3.14;
	
	@Override
	void foo() {
		super.foo();
		System.out.println("##########");
	}
//	public void bar() {
//		super.bar();
//		System.out.println("**********");
//	}
}
public class FinalTest {

	public static void main(String[] args) {
		System.out.println(SubChild.PI);
		SubChild sub=new SubChild();
		sub.foo();
		sub.bar();
	}

}
