package day10;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
/*Map계열
 * Properties
 * xxx.properties 유형의 파일을 읽어서 해당 파일에 저장된 내용을 자바로
 * 옮기고자 할 때 사용한다.
 * 
 * */
public class PropertiesTest {

	public static void main(String[] args) throws IOException{
		Properties prop=new Properties();
		prop.setProperty("OS", "Windows");
		prop.setProperty("Lang", "Java");
		System.out.println("사용하는 운영체제: "+prop.getProperty("OS"));
		System.out.println("사용하는 언   어: "+prop.getProperty("Lang"));
		System.out.println(prop);
		System.out.println("--------------------------------------");
		FileInputStream fis=new FileInputStream("src/day10/database.properties");
		prop.load(fis);
		fis.close();
		System.out.println(prop);
		
		System.out.println(prop.getProperty("DbPwd"));
		System.out.println(prop.get("DbPwd"));
		System.out.println(prop.getProperty("WAS","Tomcat(디폴트값)"));


	}

}
