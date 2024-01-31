package day06;
/*Application의 종류
 * - CLI (Command Line Interface)
 * - GUI (Graphic User Interface)
 * 기본적 기능
 *   CRUD기능
 *   - C: Create => Insert 기능
 *   - R: Read => 조회 (Select), 검색 기능
 *   - U: Update=> 수정 (Update)
 *   - D: Delete=> 삭제 (Delete)
 * */
import java.util.*;
public class JobKorea {
	static int count=0;
	static JobSeeker[] persons=new JobSeeker[20];
	Scanner sc=new Scanner(System.in);
	
	
	public static void menu() {
		System.out.println("*****JobKorea v1.1********");
		System.out.println("1. 구직자 등록");
		System.out.println("2. 회 사  등록");
		System.out.println("3. 구직자 정보 출력");
		System.out.println("4. 회 사 정보 출력");
		System.out.println("5. 구직자 정보 조회");
		System.out.println("6. 구직자 정보 수정");
		System.out.println("7. 구직자 정보 삭제");
		System.out.println("9. 종        료");
		System.out.println("**************************");
		System.out.println("메뉴번호를 입력하세요=>");
		System.out.println("**************************");
	}
	public void register() {
		if(count>=persons.length) {
			System.out.println("정원 마감!!["+persons.length+"명 등록 완료]");
			return;
		}
		JobSeeker seeker=new JobSeeker();
		seeker.input();
		System.out.println(seeker.profile());
		System.out.println("::위 정보를 저장할까요? [1.yes 2.no]");
		int yn=sc.nextInt();
		if(yn==2)return;
		
		JobKorea.persons[count++]=seeker;
		System.out.println(count+"명 구직자 정보 등록 완료!!");
	}
	public void printAll() {
		for (int i = 0; i < count; i++) {
			System.out.println(persons[i].profile());
		}
	}
	
	public void process() {
		Scanner sc=new Scanner(System.in);
		while (true) {
			JobKorea.menu();
			int no=sc.nextInt();
			
			if(no==99) {
				System.out.println("Bye Bye~~");
				System.exit(0);
			}
			
			if(no<1||no>7) {
				System.out.println("입력 오류!! 메뉴에 없는 번호에요");
				continue;
			}
			
			switch (no) {
			case 1:
				register();
				break;
			case 2:
				break;
			case 3:
				printAll();
				break;
			case 4:
				break;
			case 5:
				System.out.println("검색할 구직자 이름 입력=>");
				String findName=sc.next();
				String result=search(findName);
				System.out.println(result);
				break;
			}
		}
	}
	public String search(String name) {
		String str="";
		for (int i = 0; i < count; i++) {
			if(persons[i].getName().equals(name)) {
				str+=persons[i].profile();
			}
		}
		if(str.equals("")) {
			return name+"님 정보는 없습니다";
		}else {
			return str;
		}
	}
	
	
	public static void main(String[] args) {
		JobKorea app= new JobKorea();
		app.process();
	}

}
