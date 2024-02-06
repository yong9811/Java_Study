package day10;
import java.util.*;
import java.awt.Color;
public class HashMapTest {

	public static void main(String[] args) {
		Hashtable ht=new Hashtable();
		ht.put("하나", 1);
		ht.put("둘", "TWO");
		ht.put("파랑", "Blue");
		ht.put("빨강", java.awt.Color.red);
		
		Object obj=ht.get("둘");
		System.out.println(obj);
		
		Color obj2=(Color)ht.get("빨강");
		System.out.println(obj2.getRed()+"<=red값");
		HashMap<String, Integer> map= new HashMap<>();
		map.put("생년",2000);
		map.put("나이",24);
		map.put("용돈",500000);
		System.out.println(map);
		map.put("용돈",700000);
		System.out.println("map.size(): "+map.size());
		System.out.println(map);
		//Set<k>	keySet()
		Set<String> set=map.keySet();
		for(String key:set) {
			Integer val=map.get(key);
			System.out.println(key+"#"+val);
		}
		
		Iterator<String> it=set.iterator();
		//key값을 집합유형으로 반환해서 해당 집합을 논리적 커서를 이용해서
		//한번에 꺼내올 수 있는 방법을 제공한다
		/*boolean	hasNext()
		 * E	next()
		 * */
		
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key);
		}
		
		Collection<Integer> col=map.values();
		for(Integer k:col) {
			System.out.println(k);
		}
	}

}
