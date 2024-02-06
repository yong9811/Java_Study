package day10;
import java.util.*;
public class QueueTest {

	public static void main(String[] args) {
		Queue<String> q=new LinkedList<>();
		q.add("어제 들어온 우유");
		q.add("오늘 들어온 우유");
		q.add("내일 들어온 우유");
		System.out.println(q);
		String str=q.poll();
		System.out.println(str+"를 꺼냈어요");
		System.out.println(q);
		q.remove();
		System.out.println(q);

	}

}
