package day06;

import java.util.Scanner;

public class JobSeeker {
	private String name;
	private int birth;
	private String phone;
	private char gender;
	
	public String profile() {
		String str="---"+name+"님 프로필----\n";
		str+="이  름: "+name+"\n";
		str+="생  년: "+birth+"\n";
		str+="연락처: "+phone+"\n";
		str+="성  별: "+gender+"\n";
		return str;
	}
	
	public void setName(String js_name) {
		name=js_name;
	}
	public void setBirth(int js_birth) {
		birth = js_birth;
	}
	public void setPhone(String js_phone) {
		phone = js_phone;
	}
	public void setGender(char js_gender) {
		gender = js_gender;
	}
	public String getName() {
		return name;
	}
	public int getBirth() {
		return birth;
	}
	public String getPhone() {
		return phone;
	}
	public char getGender() {
		return gender;
	}
	
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력하세요=>");
		String nm=sc.next();
		setName(nm);
		System.out.println("생년을 입력하세요=>");
		int year=sc.nextInt();
		setBirth(year);
		System.out.println("번호를 입력하세요=>");
		String tel=sc.next();
		setPhone(tel);
		System.out.println("성별을 입력하세요[여자:F, 남자:M]=>");
		char gender=sc.next().charAt(0);
		setGender(gender);
		
		
	}
}
