package day10;
import java.util.*;
public class HashSetTest2 {

	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person("이영희",22);
		Person p3=new Person("홍길동",25);
		HashSet<Person> set=new HashSet<>();
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		System.out.println(set.size()+"명 저장됨");
		
		Iterator<Person> it=set.iterator();
		while (it.hasNext()) {
			Person p =it.next();
			System.out.println(p.getName()+"=> "+p.getAge()+"세");
		}
		
		Person p4=new Person("이영희",22);
		set.add(p4);
		
		System.out.println("set.size(): "+set.size());
		System.out.println("*********************");
		for(Person p:set) {
			System.out.println(p.getName()+": "+p.getAge());
		}
	}

}
