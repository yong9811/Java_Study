package day10;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("김철수", 20);
		
	}
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p=(Person)obj;
			boolean bool=(this.name.equals(p.getName())&& this.age==p.getAge());
			return bool;
		}else {
		return false;
		}
	}
}
