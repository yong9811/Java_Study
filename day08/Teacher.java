package day08;
//Person상속받고 subject(과목) 추가, 생성자 오버로드하기
public class Teacher extends Person{
	
	String subject;	
	public Teacher() {
		super(0,"교사","010");
	}

	public Teacher(int no, String nm, String t, String sub) {
		super(no, nm, t);
		subject=sub;
	}
	@Override
	public String toString() {
		String str=super.toString().replace("Person", "Teacher");
		str+="\nSubject: "+subject;
		return str;
	}
}/////////////////////////
