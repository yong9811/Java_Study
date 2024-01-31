package day06;

public class JobKoreaApp {

	public static void main(String[] args) {
		JobSeeker js1= new JobSeeker();
		JobSeeker js2= new JobSeeker();
		
		js1.setName("김철수");
		js1.setBirth(1992);
		js1.setPhone("010-2222-3333");
		js1.setGender('M');
		
		System.out.println(js1.profile());
		
		js2.setName("김영희");
		js2.setBirth(1994);
		js2.setPhone("010-4444-5555");
		js2.setGender('F');
		
		System.out.println(js2.profile());
		
		JobSeeker[] arr=new JobSeeker[2];
		arr[0]=js1;
		arr[1]=js2;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].profile());
		}
		System.out.println("##################");
		for(JobSeeker seeker:arr) {
			System.out.println(seeker.getName());
		}
	}

}
