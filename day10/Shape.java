package day10;
/*추상클래스란?
 * - 추상메서드를 1개 이상 가진 클래스
 * - 사용하는 이유는> 상속받게할 목적으로 사용=>자식 클래스에서 추상메서드를 강제로 오버라이딩 시키기 위함
 *추상메서드란?
 * - 메서드 몸체 없이 헤더만 선언한 것 
 * 	  void area();
 * */
public abstract class Shape {
	private String info="나는 도형 클래스";
	public String getInfo() {
		return info;
	}
	abstract void area(int x, int y);
}
class Rectangle extends Shape
{
	@Override
	void area(int w, int h) {
		int res=w*h;
		System.out.println("사각형 면적: "+res);
	}
}
class Triangle extends Shape
{
	@Override
	protected void area(int a, int b) {
		int res=a*b/2;
		System.out.println("직삼각형 면적: "+res);
	}
}
abstract class Circle extends Shape
{
	final double pi=3.14;
}

class SubCircle extends Circle
{
	@Override
	public void area(int r, int r2) {
	}
	public void area(int r) {
		double res=pi*r*r;
		System.out.println("원의 면적: "+res);
	}
}