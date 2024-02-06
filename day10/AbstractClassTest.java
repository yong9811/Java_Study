package day10;

public class AbstractClassTest {

	public static void main(String[] args) {
		System.out.println("여러 도형의 면적을 구해봅시다~~~");
		System.out.printf("가로: %d, 세로: %d인 도형 면적---\n",12,10);
		
		Rectangle rt=new Rectangle();
		rt.area(12,10);
		
		Triangle tr=new Triangle();
		tr.area(12,10);
		
		Circle cr=new SubCircle();
		SubCircle cr2=new SubCircle();
		((SubCircle)cr).area(12);
		cr2.area(12);
		
		Shape sp=new Rectangle();
		sp.area(8, 10);
		
		//rt, tr, cr, cr2, sp 를 저장할 배열을 생성하고
		//저장한 후 반복문 돌려서 각 도형의 면적을 출력하기
		//가로:20, 세로 : 30
		//반지름: 20
		
		Shape[] shapes = {rt,tr,cr,cr2,sp};
		for(Shape obj:shapes) {
			System.out.println("------------");
			if(obj instanceof SubCircle) {
				((SubCircle)obj).area(20);
				continue;
			}
			obj.area(20, 30);
			
		}
		
		
	}

}
