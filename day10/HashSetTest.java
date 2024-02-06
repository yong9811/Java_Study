package day10;
import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<>();
		set.add("Java");
		set.add("Servlet");
		set.add("JSP");
		set.add("Spring");
		System.out.println("set.size(): "+set.size());
		set.add("JSP");
		System.out.println("set.size() 2: "+set.size());
	
	 /* # Iterator의 경우**************************************
	 * Iterator인터페이스는 객체들을 집합체로
	 * 관리하도록 해주는 인터페이스이다.
	 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
	 * 처리할 수 있는 메소드를 제공한다.
	 * 	- boolean hasNext(): 논리적 커서(첫번째 요소 직전에
	 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
	 * 				없으면 false를 반환
	 *  - E next() : 논리적 커서를 다음 요소로 이동하고
	 *  			현재 가리키고 있는 요소를 반환한다.
	 * */
		
		
		Iterator<String> it=set.iterator();
		for(int i=1;it.hasNext();i++) {
			String value=it.next();
			System.out.println(i+":"+value);
		}
		
		for(String str:set) {
			System.out.println(str.toLowerCase());
		}
	}

}
