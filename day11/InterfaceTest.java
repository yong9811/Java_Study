package day11;

interface MyInter{
	void foo();
	void bar(String str);
}

interface YourInter{
	String GREETING="Hi";
	int baz();
}

class MyClass implements MyInter, YourInter{

	@Override
	public void foo() {
		System.out.println("foo()");
	}

	@Override
	public void bar(String str) {
		System.out.println("bar(): "+str);
	}

	@Override
	public int baz() {
		return 0;
	}
}

public class InterfaceTest {

	public static void main(String[] args) {
		MyInter mi=new MyClass();
		mi.foo();
		mi.bar("안녕");
		int n=((MyClass)mi).baz();
		System.out.println(n);
		
		YourInter yi=new MyClass();
		yi.baz();
		((MyClass)yi).foo();
		((MyClass)yi).bar("진짜안녕");
		System.out.println(MyClass.GREETING);
		System.out.println(YourInter.GREETING);
		System.out.println(yi.GREETING);
	}

}
